package DynamicProgramming;

import java.util.*;

public class plank {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int i, j, q;
		int price[] =  { 0, 1, 5, 8, 9, 10, 17, 17, 20 };
		int n = price.length-1;
	//	for (i = 1; i <= n; i++)
		//	price[i] = in.nextInt();
		int val[] = new int[n + 1];
		val[0] = 0;
		for (j = 1; j <= n; j++) {
			q = Integer.MIN_VALUE;
			for (i = 1; i <= j; i++) {
				if (price[i] + val[j - i] > q)
					q = price[i] + val[j - i];
				val[j] = q;
			}
		}
		System.out.println(val[val.length - 1]);

		int arr[] = { 0, 1, 5, 8, 9, 10, 17, 17, 20 };
		rod(arr);
	}

	public static void rod(int[] price) {
		int[] B = new int[price.length];
		B[0] = 0;
		B[1] = price[1];
		int MAX;
		for (int i = 1; i < price.length; i++) {

			MAX = Integer.MIN_VALUE;
			MAX = B[0] + price[i];
			for (int j = 1; j < i; j++) {

				if (MAX < B[j] + B[i - j])
					MAX = B[j] + B[i - j];
			}
			B[i] = MAX;
		}

		System.out.println(B[B.length - 1]);

	}
}
