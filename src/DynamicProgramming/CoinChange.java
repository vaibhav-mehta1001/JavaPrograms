package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		coinChange(a, 5);

	}

	static void coinChange(int[] coins, int N) {
		Arrays.sort(coins);

		int values[] = new int[N + 1];
		values[0] = 0;
		for (int i = 1; i <= N; i++) {
			int j = 0;
			int MIN = Integer.MAX_VALUE;
			while (j < coins.length) {
				if (coins[j] > i)
					break;

				if (MIN > values[i - coins[j]] + 1)
					MIN = values[i - coins[j]] + 1;
				j++;

			}
			values[i] = MIN;
			j = 0;
			MIN = 0;

		}
		System.out.println(values[N]);

	}
}
