package csen1002.main.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Write your info here
 * 
 * @name Nadeem Hesham Ghaly
 * @id 43-3854
 * @labNumber 12
 */

public class FFCFG {

	ArrayList<ArrayList<String>> transitions;
	HashMap<String, ArrayList<String>> FirstMap;
	HashMap<String, ArrayList<String>> FollowMap;

	public FFCFG(String description) {

		transitions = new ArrayList<ArrayList<String>>();
		FirstMap = new HashMap<String, ArrayList<String>>();
		FollowMap = new HashMap<String, ArrayList<String>>();

		String[] L = description.split(";");
		String[] Ltemp;
		for (int i = 0; i < L.length; i++) {
			transitions.add(new ArrayList<String>());
			Ltemp = L[i].split(",");

			for (int j = 0; j < Ltemp.length; j++) {
				transitions.get(i).add(Ltemp[j]);
			}
		}
	}

	public String first() {

		for (int i = 0; i < transitions.size(); i++) {
			FirstMap.put(transitions.get(i).get(0), new ArrayList<String>());
		}

		ArrayList<String> newFirstArrayL;
		ArrayList<String> x;
		String root;
		HashMap<String, ArrayList<String>> FirstMapOld;

		do {
			FirstMapOld = copy(FirstMap);

			for (int i = 0; i < transitions.size(); i++) {
				root = transitions.get(i).get(0);
				newFirstArrayL = FirstMap.get(root);
				for (int j = 1; j < transitions.get(i).size(); j++) {
					for (int k = 0; k < transitions.get(i).get(j).length(); k++) {

						if (transitions.get(i).get(j).charAt(k) >= 'a' && transitions.get(i).get(j).charAt(k) <= 'z') {
							if (!newFirstArrayL.contains("" + transitions.get(i).get(j).charAt(k)))
								newFirstArrayL.add("" + transitions.get(i).get(j).charAt(k));
							break;
						} else if (transitions.get(i).get(j).charAt(k) >= 'A'
								&& transitions.get(i).get(j).charAt(k) <= 'Z') {
							x = FirstMap.get("" + transitions.get(i).get(j).charAt(k));

							for (int ii = 0; ii < x.size(); ii++) {
								if (!newFirstArrayL.contains("" + x.get(ii)) && !x.get(ii).equals("e"))
									newFirstArrayL.add("" + x.get(ii));
							}

							if (x.contains("e") && k == transitions.get(i).get(j).length() - 1
									&& !newFirstArrayL.contains("e"))
								newFirstArrayL.add("e");

							if (!x.contains("e"))
								break;
						}

					}
				}
			}

		} while (!FirstMapOld.equals(FirstMap));

		return Stringify(FirstMap, false);
	}


	public String Stringify(HashMap<String, ArrayList<String>> map, Boolean isFollow) {
		String x = "";
		Boolean flag;
		ArrayList<String> temp;
		for (int i = 0; i < transitions.size(); i++) {
			flag = false;
			x += transitions.get(i).get(0) + ",";
			temp = map.get(transitions.get(i).get(0));
			temp.sort(Comparator.naturalOrder());
			for (int j = 0; j < temp.size(); j++) {
				if (isFollow && temp.get(j).equals("$"))
					flag = true;
				else
					x += temp.get(j);
			}
			if (flag)
				x += "$";
			x += ";";
		}
		x = x.substring(0, x.length() - 1);
		return x;

	}

	public String follow() {
		first();

		HashMap<String, ArrayList<String>> followers = new HashMap<String, ArrayList<String>>();

		for (int i = 0; i < transitions.size(); i++) {
			FollowMap.put(transitions.get(i).get(0), new ArrayList<String>());
			followers.put(transitions.get(i).get(0), new ArrayList<String>());
		}
		
		String currentTrans;
		String nextLetterInTrans;
		char nextLetterInTransChar;

		String LetterWeGettingFollowersFor;
		ArrayList<String> listOfLetterWeGettingFollowersFor;

		String root;
		ArrayList<String> listOfCurrentLetter;
		
		int indexOfLetterWeGettingFollowersFor;

		for (int ii = 0; ii < transitions.size(); ii++) {

			LetterWeGettingFollowersFor = transitions.get(ii).get(0);
			listOfLetterWeGettingFollowersFor = FollowMap.get(LetterWeGettingFollowersFor);
			
			if(LetterWeGettingFollowersFor.equals("S")) {
				listOfLetterWeGettingFollowersFor.add("$");
			}

			for (int i = 0; i < transitions.size(); i++) {
				root = transitions.get(i).get(0);

				for (int j = 1; j < transitions.get(i).size(); j++) {
					currentTrans = transitions.get(i).get(j);
					
					while (currentTrans.contains(LetterWeGettingFollowersFor)) {	//lw el letter el badawar aleih mawgood
						
						indexOfLetterWeGettingFollowersFor=currentTrans.indexOf((LetterWeGettingFollowersFor));
						
						if(indexOfLetterWeGettingFollowersFor == currentTrans.length()-1) {// howa last letter
							if(!followers.get(LetterWeGettingFollowersFor).contains(root))
								followers.get(LetterWeGettingFollowersFor).add(root);
							break; //hatwadeny lel next trans;
						}
						
						for (int k = indexOfLetterWeGettingFollowersFor+1 ; k < currentTrans.length() ; k++) {
							nextLetterInTrans = "" + currentTrans.charAt(k);
							nextLetterInTransChar = currentTrans.charAt(k);
							
							
							if (nextLetterInTransChar >= 'a' && nextLetterInTransChar <= 'z') { // terminal
								if(!FollowMap.get(LetterWeGettingFollowersFor).contains(nextLetterInTrans))
									FollowMap.get(LetterWeGettingFollowersFor).add(nextLetterInTrans);
								break;
							} else { // variable
								listOfCurrentLetter = FirstMap.get(nextLetterInTrans);
								
								
								for(int kkk=0; kkk<listOfCurrentLetter.size();kkk++) {
									if(!FollowMap.get(LetterWeGettingFollowersFor).contains(listOfCurrentLetter.get(kkk)) && !listOfCurrentLetter.get(kkk).equals("e") )
											FollowMap.get(LetterWeGettingFollowersFor).add(listOfCurrentLetter.get(kkk));
								}
								if(listOfCurrentLetter.contains("e") && k==currentTrans.length()-1) {

									
									followers.get(LetterWeGettingFollowersFor).add(root);
								}
								if(!listOfCurrentLetter.contains("e")) {
									break;
								}
							}

						}
						currentTrans = currentTrans.substring(indexOfLetterWeGettingFollowersFor+1,currentTrans.length());
					}

				}
			}
		}
		
		ArrayList<String> temp;
		ArrayList<String> temp2;
		boolean flag;
		
		do {
			flag = false;
			for (int i = 0; i < transitions.size(); i++) {
				temp = followers.get(transitions.get(i).get(0));		//get followers of root
				
				for( int j=0; j< temp.size();j++) {
					temp2= FollowMap.get(temp.get(j));
					for(int k=0;k<temp2.size();k++) {
						if( !FollowMap.get(transitions.get(i).get(0)).contains(temp2.get(k))) {
							flag=true;
							FollowMap.get(transitions.get(i).get(0)).add(temp2.get(k));
						}
					}
				}
			}
		}while(flag);
		
		return Stringify(FollowMap, true);
	}

	public static HashMap<String, ArrayList<String>> copy(HashMap<String, ArrayList<String>> original) {
		HashMap<String, ArrayList<String>> copy = new HashMap<String, ArrayList<String>>();
		for (Map.Entry<String, ArrayList<String>> entry : original.entrySet()) {
			copy.put(entry.getKey(),
					// Or whatever List implementation you'd like here.
					new ArrayList<String>(entry.getValue()));
		}
		return copy;
	}


}