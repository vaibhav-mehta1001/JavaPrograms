import java.util.Stack;

public class A {

	private static Stack<Character> s;
	private static String iS;
	public static String Answer = "";

	public static String toPostfix(String iString) {
		iS = iString;
		s = new Stack<Character>();
		String outputString = "";
		boolean fI = false;
		for (int i = 0; i < iS.length(); i++) {
			char curChar = iS.charAt(i);
			if (!isOperator(curChar)) {
				outputString += Character.toString(curChar);
				if (i == (iS.length() - 1)) {
					while (!s.empty()) {
						outputString += " " + s.pop() + " ";
					}
				}
			} else {
				outputString += " ";
				if (fI) {
					if (pMin(curChar) && pMin((Character) s.peek())) {
						outputString += " " + s.pop() + " ";
						s.push(curChar);
						if (i == (iS.length() - 1)) {
							while (!s.empty()) {
								outputString += " " + s.pop() + " ";
							}
						}
					} else if (mDiv(curChar) && mDiv((Character) s.peek())) {
						outputString += " " + s.pop() + " ";
						s.push(curChar);
						if (i == (iS.length() - 1)) {
							while (!s.empty()) {
								outputString += " " + s.pop() + " ";
							}
						}
					} else if (pMin(curChar) && mDiv((Character) s.peek())) {
						outputString += " " + s.pop() + " ";
						s.push(curChar);
						if (i == (iS.length() - 1)) {
							while (!s.empty()) {
								outputString += " " + s.pop() + " ";
							}
						}
					} else if (mDiv(curChar) && pMin((Character) s.peek())) {
						s.push(curChar);
						if (i == (iS.length() - 1)) {
							while (!s.empty()) {
								outputString += " " + s.pop() + " ";
							}
						}
					} else {
						outputString += Character.toString(curChar);
						if (i == (iS.length() - 1)) {
							while (!s.empty()) {
								outputString += " " + s.pop() + " ";
							}
						}
					}
				} else {
					s.push(curChar);
					fI = true;
				}
			}
		}
		return outputString;
	}

	public static boolean isOperator(char op) {
		switch (op) {
		case '+':
			return true;
		case '-':
			return true;
		case '/':
			return true;
		case '*':
			return true;
		default:
			return false;
		}
	}

	public static boolean pMin(char op) {
		switch (op) {
		case '+':
			return true;
		case '-':
			return true;
		default:
			return false;
		}
	}

	public static boolean mDiv(char op) {
		switch (op) {
		case '*':
			return true;
		case '/':
			return true;
		default:
			return false;
		}
	}

	public static String solve(String anb) {

		String a = toPostfix(anb);
		String delims = "[ ]+";
		String[] tokens = a.split(delims);
		Stack<String> values = new Stack<String>();
		for (int i = 0; i < tokens.length; i++) {
			String ar = tokens[i];
			if (ar.equals("+") || ar.equals("-") || ar.equals("*")
					|| ar.equals("/")) {
				double ab = Double.parseDouble(values.pop());
				double ac = Double.parseDouble(values.pop());
				double temp;
				char arc = ar.charAt(0);
				switch (arc) {
				case '/':
					temp = ac / ab;
					values.push(Double.toString(temp));
					break;
				case '*':
					temp = ac * ab;
					values.push(Double.toString(temp));
					break;
				case '-':
					temp = ac - ab;
					values.push(Double.toString(temp));
					break;
				case '+':
					temp = ac + ab;
					values.push(Double.toString(temp));
					break;
				}
			} else {
				values.push(ar);
			}
		}
		Answer = values.peek();
		return Answer;
	}

}
