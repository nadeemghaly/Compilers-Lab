package csen1002.main.task1;


/**
 * 
 * 
 * @name Nadeem Hesham Ghaly
 * @id 43-3854
 * @labNumber 12
 */
public class DFA {
	String state;
	String[] input0;  
	String[] input1;
	String[] acceptStates;
	
	
	public DFA(String description) {
		String[] split1 = description.split("#",-1);
		acceptStates = split1[1].split(",");
		state = "0";
		
		String[] transitions = split1[0].split(";");
		
		input0 = new String[transitions.length];
		input1 = new String[transitions.length];
		
		String[] transition;
		
		for(int i=0; i < transitions.length;i++) {
			transition=transitions[i].split(",");
			input0[ Integer.parseInt(transition[0]) ]=transition[1];
			input1[ Integer.parseInt(transition[0]) ]=transition[2];
		}
		
	}
	
	
	public boolean run(String input) {
		for(int i=0 ; i<input.length();i++) {
			if(input.charAt(i) == '0')
				state = input0[Integer.parseInt(state)];
			else if(input.charAt(i) == '1')
				state = input1[Integer.parseInt(state)];
		}
		
		
		for(int i=0; i<acceptStates.length;i++) {
			if(acceptStates[i].equals(state))
				return true;
		}
		return false;
	}
}
