package csen1002.main.task5;

import java.util.ArrayList;

/**
 * Write your info here
 * 
 * @name Nadeem Ghaly
 * @id 43-3854
 * @labNumber 12
 */
public class CFG {

	ArrayList<ArrayList<String>> transitions;

	public CFG(String description) {
		String[] L = description.split(";");
		transitions = new ArrayList<ArrayList<String>>();
		String[] Ltemp;
		for (int i = 0; i < L.length; i++) {
			transitions.add(new ArrayList<String>());
			Ltemp = L[i].split(",");

			for (int j = 0; j < Ltemp.length; j++) {
				transitions.get(i).add(Ltemp[j]);
			}
		}
	}

	public String lre() {
		ArrayList<String> doneLetters = new ArrayList<String>();

		String root;
		String transition;
		String firstChar;
		String checkLetter;
		ArrayList<String> beta;
		ArrayList<String> alpha;
		ArrayList<String> L;
		ArrayList<String> newL;
		ArrayList<String> newLdash;
		for (int i = 0; i < transitions.size(); i++) {
			beta = new ArrayList<String>();
			alpha = new ArrayList<String>();
			newL = new ArrayList<String>();
			newLdash = new ArrayList<String>();

			L = transitions.remove(i);

			root = L.remove(0);
			doneLetters.add(root);
			for (int i1 = 0; i1 < doneLetters.size(); i1++) {
				
				if(root.equals(doneLetters.get(i1))) {
					for (int j = 0; j < L.size(); j++) {
						transition = L.get(j);
						firstChar = transition.charAt(0) + "";
						if (firstChar.equals(root)) {
							alpha.add(transition.substring(1));
						} else {
							beta.add(transition.substring(0));
						}
					}
					if (alpha.size() == 0) {
						L.add(0, root);
						transitions.add(i, L);
					} else {
						newL.add(root);
						for (int j = 0; j < beta.size(); j++) {
							newL.add(beta.get(j) + root + "'");
						}
						newLdash.add(root + "'");
						for (int j = 0; j < alpha.size(); j++) {
							newLdash.add(alpha.get(j) + root + "'");
						}
						newLdash.add("e");
						transitions.add(i, newLdash);
						transitions.add(i, newL);
					}
				}
				else if(root.length()<2) {
					checkLetter = doneLetters.get(i1);
					
					for (int k = 0; k < L.size(); k++) {
						transition = L.remove(k);
						firstChar = transition.charAt(0) + "";
						if (firstChar.equals(checkLetter)) {
							ArrayList<String> kefayaVariables = Helper(checkLetter);
							transition = transition.substring(1);
							for (int iii = kefayaVariables.size() - 1; iii > 0; iii--) {
								L.add(k, kefayaVariables.get(iii) + transition);
							}
						} else {
							L.add(k, transition);
						}
					}
					
				}
			}
		}
		return CFGStringify();
	}

	public ArrayList<String> Helper(String letter) {
		ArrayList<String> L;
		String root;
		for (int i = 0; i < transitions.size(); i++) {
			L = transitions.get(i);
			root = L.get(0);
			if (root.equals(letter))
				return L;
		}
		return null;
	}

	public String CFGStringify() {
		String out = "";
		for (int i = 0; i < transitions.size(); i++) {
			for (int j = 0; j < transitions.get(i).size(); j++) {
				out += transitions.get(i).get(j);
				if (j < transitions.get(i).size() - 1)
					out += ",";
			}
			if (i < transitions.size() - 1)
				out += ";";
		}
		return out;
	}
}
