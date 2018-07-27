import java.util.Scanner;

public class LinearEquations {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Equation ");
		String expr = in.nextLine();
		// System.out.print("a = ");
		solve(expr);
	}

	public static void solve(String expr) {

		String before = "";
		String after = "";

		for (int i = 0; i < expr.length(); i++) {
			if (expr.charAt(i) == '=') {
				before = expr.substring(0, i);
				after = expr.substring(i + 1);
			}
		}
		String before1 = before;
		String after1 = after;
		String a1 = "";
		String a2 = "";

		for (int i = 1; i <= 2000; i++) {
			before1 = before1.replace("a", Double.toString(i));
			after1 = after1.replace("a", Double.toString(i));

			a1 = A.solve(before1);

			a2 = A.solve(after1);

			double value1 = Double.parseDouble(a1);
			double value2 = Double.parseDouble(a2);
			if (value1 == value2) {
				System.out.println(i);
			}
			before1 = before;
			after1 = after;

		}

	}
}
