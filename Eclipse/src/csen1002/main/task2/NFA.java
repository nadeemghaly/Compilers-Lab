package csen1002.main.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Write your info here
 * 
 * @name Nadeem Hesham Ghaly
 * @id 43-3854
 * @labNumber 12
 */
public class NFA{
	List epsilonTransitions;
	List zeroTransitions;
	List oneTransitions;
	List<String> state;
	List<String> acceptStates;
	
	public NFA(String description) {

		epsilonTransitions = new ArrayList();
		zeroTransitions = new ArrayList();
		oneTransitions = new ArrayList();
		state = new ArrayList();
		acceptStates = new ArrayList();
		
		String[] split1 = description.split("#",-1);
		
		String[] split2 = split1[0].split(";", 0);		//zero trans
		String[] split3 = split1[1].split(";", 0);		//one trans
		String[] split4 = split1[2].split(";", 0);		//epsilon trans
		String[] split5 = split1[3].split(";", 0);		//accept states
		
		for(int i=0;i<split5.length;i++) {
			acceptStates.add(split5[i]);
		}
		
		
		int maxState=getMaxState(split2,split3,split4);
		
		getEpsilonTransitions(maxState,split4);
		getZeroTransitions(maxState,split2);
		getOneTransitions(maxState,split3);
		
		for(int i=0;i<((List) epsilonTransitions.get(0)).size();i++) {
			state.add((String) ((List) epsilonTransitions.get(0)).get(i));
		}

		
	}
	
	public int getMaxState(String[] split2,String[] split3,String[] split4) {
		int maxState = 0;
		
		for(int i=0;i<split2.length;i++) {
			String[] split21 = split2[i].split(",", 0);
			for(int j=0;j<split21.length;j++) {
				if(Integer.parseInt(split21[j])>maxState)
					maxState=Integer.parseInt(split21[j]);
			}
		}
		
		
		for(int i=0;i<split3.length;i++) {
			String[] split31 = split3[i].split(",", 0);
			for(int j=0;j<split31.length;j++) {
				if(Integer.parseInt(split31[j])>maxState)
					maxState=Integer.parseInt(split31[j]);
			}
		}
		
		
		for(int i=0;i<split4.length;i++) {
			String[] split41 = split4[i].split(",", 0);
			for(int j=0;j<split41.length;j++) {
				if(Integer.parseInt(split41[j])>maxState)
					maxState=Integer.parseInt(split41[j]);
			}
		}
			
		return maxState;
	}
	
	public void getEpsilonTransitions(int maxState, String[] split4) {
		for(int i=0;i<=maxState;i++) {			//initialize epsilon transitions
			List temp=new ArrayList();
			temp.add(""+i);
			epsilonTransitions.add(i, temp); 
			zeroTransitions.add(i, new ArrayList()); 
			oneTransitions.add(i, new ArrayList()); 
		}

		for(int i=0;i<split4.length;i++) {
			String[] split41 = split4[i].split(",", 0);
				List temp = (ArrayList) epsilonTransitions.get(Integer.parseInt(split41[0]));
				temp.add(split41[1]);
				epsilonTransitions.set(Integer.parseInt(split41[0]) , temp); 
		}
		
		boolean changed = false;
		do {
			changed = false;
			for(int i = 0; i<epsilonTransitions.size();i++) {
				List currentTemp = (ArrayList) epsilonTransitions.get(i);
				for(int j=0;j<currentTemp.size();j++) {
					int targetEpsilonIndex = Integer.parseInt((String) currentTemp.get(j));
					List targetTemp = (ArrayList) epsilonTransitions.get(targetEpsilonIndex);
					for(int k=0;k<targetTemp.size();k++) {
						if(!currentTemp.contains(targetTemp.get(k))) {
							changed=true;
							currentTemp.add(targetTemp.get(k));
						}
					}
				}
				epsilonTransitions.set(i,currentTemp);
			}
		} while(changed);
	}
	
	public void getZeroTransitions(int maxState, String[] split2) {
		for(int i=0;i<split2.length;i++) {
			String[] split21 = split2[i].split(",", 0);
				List temp = (ArrayList) zeroTransitions.get(Integer.parseInt(split21[0]));
				temp.add(split21[1]);
				zeroTransitions.set(Integer.parseInt(split21[0]) , temp); 
		}
	}
	
	public void getOneTransitions(int maxState, String[] split3) {
		for(int i=0;i<split3.length;i++) {
			String[] split31 = split3[i].split(",", 0);
				List temp = (ArrayList) oneTransitions.get(Integer.parseInt(split31[0]));
				temp.add(split31[1]);
				oneTransitions.set(Integer.parseInt(split31[0]) , temp); 
		}
	}
	
	public boolean run(String input) {
		
		
		List<String> newState = new ArrayList();
		
		for(int i=0 ; i<input.length();i++) {
			if(input.charAt(i) == '0') {
				for(int j= 0;j<state.size();j++) {
					int currentState= Integer.parseInt(state.get(j));
					List temp = (ArrayList) zeroTransitions.get(currentState);
					
					for(int k=0;k<temp.size();k++)
						newState.add((String) temp.get(k));
				}
			}
			else if(input.charAt(i) == '1') {
				for(int j= 0;j<state.size();j++) {
					int currentState= Integer.parseInt(state.get(j));
					List temp = (ArrayList) oneTransitions.get(currentState);
					
					for(int k=0;k<temp.size();k++)
						newState.add((String) temp.get(k));
				}
			}
			
			for(int j= 0;j<newState.size();j++) {
				int currentState= Integer.parseInt(newState.get(j));
				List temp = (ArrayList) epsilonTransitions.get(currentState);
				for(int k=0;k<temp.size();k++) {
					if(!newState.contains(temp.get(k)))
						newState.add((String) temp.get(k));
				}
			}
			
			state=newState;
			newState = new ArrayList();
		}
		
		
		for(int i= 0;i<state.size();i++) {
			if(acceptStates.contains(state.get(i)))
				return true;
		}
		return false;
	}
}
