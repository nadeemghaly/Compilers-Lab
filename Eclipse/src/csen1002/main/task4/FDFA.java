package csen1002.main.task4;

import java.util.Stack;

/**
 * Write your info here
 * 
 * @name Nadeem Hesham Ghaly
 * @id 43-3854
 * @labNumber 12
 */
public class FDFA {
	String state;
	String[] input0;
	String[] input1;
	String[] suffix;
	String[] acceptStates;
	Stack<String> stack;

	public FDFA(String description) {
		stack = new Stack<String>();
		String[] split1 = description.split("#", -1);
		acceptStates = split1[1].split(",");


		String[] transitions = split1[0].split(";");

		input0 = new String[transitions.length];
		input1 = new String[transitions.length];
		suffix = new String[transitions.length];

		String[] transition;

		for (int i = 0; i < transitions.length; i++) {
			transition = transitions[i].split(",");
			input0[Integer.parseInt(transition[0])] = transition[1];
			input1[Integer.parseInt(transition[0])] = transition[2];
			suffix[Integer.parseInt(transition[0])] = transition[3];
		}

	}

	public String run(String input) {
		String out = "";
		String in = input;

		while (in.length() != 0) {
			state = "0";
			stack.push("0");
			
			for (int i = 0; i < in.length(); i++) {
				if (in.charAt(i) == '0') {

					stack.push(input0[Integer.parseInt(state)]);
					state = input0[Integer.parseInt(state)];
				} else if (in.charAt(i) == '1') {

					stack.push(input1[Integer.parseInt(state)]);
					state = input1[Integer.parseInt(state)];
				}

			}

			Boolean flag = false;
			String topState = stack.peek();
			while (!stack.isEmpty()) {
				String stateTemp = stack.pop();
				for (int i = 0; i < acceptStates.length; i++) {
					if (acceptStates[i].equals(stateTemp)) {
						out += in.substring(0, stack.size());
						in = in.substring(stack.size());
						while (!stack.isEmpty()) {
							stack.pop();
						}
						out += "," + suffix[Integer.parseInt(stateTemp)] + ";";
						flag = true;
					}
				}
			}
			if (!flag) {
				out += in + "," + suffix[Integer.parseInt(topState)] + ";";
				in = "";
			}

		}
		
		return out;
	}
}
