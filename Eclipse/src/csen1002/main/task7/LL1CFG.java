package csen1002.main.task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Write your info here
 * 
 * @name Nadeem Hesham Ghaly
 * @id 43-3854
 * @labNumber 12
 */

public class LL1CFG {

	ArrayList<ArrayList<String>> transitions;

	ArrayList<String> tmpNon = new ArrayList<String>();
	static HashMap<String, ArrayList<String>> FirstMap;
	HashMap<String, ArrayList<String>> FollowMap;
	HashMap<String, HashMap<String, String>> LL1Table;
	ArrayList<String> currentCFG;

	public LL1CFG(String description) {

		transitions = new ArrayList<ArrayList<String>>();
		FirstMap = new HashMap<String, ArrayList<String>>();
		FollowMap = new HashMap<String, ArrayList<String>>();
		LL1Table = new HashMap<String, HashMap<String, String>>();

		String[] transitionsFirstFollow = description.split("#");

		char letter;
		HashMap<String, String> allHashes = new HashMap<String, String>();
		for (int i = 0; i < description.length(); i++) {
			letter = description.charAt(i);
			if (allHashes.get("" + letter) == null && (letter >= 'a' && letter <= 'z' && letter != 'e')
					|| letter == '$') {
				allHashes.put("" + letter, "");
			}
		}

		String[] transitions = transitionsFirstFollow[0].split(";");
		String[] Firsts = transitionsFirstFollow[1].split(";");
		String[] Follows = transitionsFirstFollow[2].split(";");

		ArrayList<String> arrl;
		for (int i = 0; i < transitions.length; i++) {
			String[] transition = transitions[i].split(",");
			String[] First = Firsts[i].split(",");
			String[] Follow = Follows[i].split(",");
			arrl = new ArrayList<String>();

			HashMap<String, String> temp = copy(allHashes);
			for (int j = 0; j < First.length; j++) {
				if (j != 0) {
					for (int k = 0; k < First[j].length(); k++) {
						arrl.add("" + First[j].charAt(k));
						if (First[j].charAt(k) != 'e') {
							temp.put("" + First[j].charAt(k), transition[j]);
						} else {
							for (int kk = 0; kk < Follow[1].length(); kk++) {
								temp.put("" + Follow[1].charAt(kk), transition[j]);
							}
						}
					}
				}
			}
			LL1Table.put(transition[0], temp);
			FirstMap.put(transition[0], arrl);
		}

		currentCFG = new ArrayList<String>();

	}

	public String parse(String input) {
		String result = "";
		String done = "";
		Stack<Character> s = new Stack<Character>();
		s.push('$');
		s.push('S');
		result += "S";
		while (s.peek() != '$') {
			for (int i = 0; i < input.length();) {
				char c = s.pop();

				if (c >= 'A' && c <= 'Z') {
					if (LL1Table.get(c + "").get(input.charAt(i) + "").length() == 0) {
						return result + ",ERROR";
					}
						else {
						
						String stringTemp = LL1Table.get(c + "").get(input.charAt(i) + "");
						for (int j = stringTemp.length() - 1; j >= 0; j--) {
							if (stringTemp.charAt(j) != 'e')
								s.push(stringTemp.charAt(j));
						}
					}
				} else if (c != input.charAt(0))
					return result += ",ERROR";

				if (s.isEmpty())
					return result += ",ERROR";

				while (s.peek() == input.charAt(0)) {

					done += input.charAt(0);

					input = input.substring(1);
					c = s.pop();

					if (input.length() == 0 && s.size() == 1) {
						return result += "," + done + stringStack(s);
					}

					if (input.length() == 0) {
						result += "," + done + stringStack(s);
						while (s.size() != 1) {
							c = s.pop();
							if (c >= 'a' && c <= 'z') {
								return result += ",ERROR";
							}
							String first =LL1Table.get(""+c).get("$");
							if(first.length()==0)
								return result += ",ERROR";
							else {
								for(int ii = first.length()-1;ii>=0;ii--) {
									if (first.charAt(ii) != 'e')
									s.push(first.charAt(ii));
								}
								result += "," + done + stringStack(s);
							}
							
						}
						return result;
					}

					if (s.isEmpty())
						return result += ",ERROR";
				}
				result += "," + done + stringStack(s);
			}

		}
		return result;
	}

	public static HashMap<String, String> copy(HashMap<String, String> original) {
		HashMap<String, String> copy = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : original.entrySet()) {
			copy.put(entry.getKey(), "");
		}
		return copy;
	}



	public static String stringStack(Stack<Character> s) {
		@SuppressWarnings("unchecked")
		Stack<Character> s2 = (Stack<Character>) s.clone();
		String result = "";
		Character c;
		while (!s2.isEmpty()) {
			c = s2.pop();
			if (c != '$')
				result += c;
		}
		return result;
	}

}
