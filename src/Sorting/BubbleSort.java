package Sorting;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 5,b= 6;
		System.out.println(a^b);
		int N = 5;
		int[] list = { 8, 3, 2, 1, 0 };

		for (int i = 0; i < N; i++) {
			System.out.print(list[i]);
		}
		int k = 0;
		System.out.println();
		int c = 0;
		int temp = 0;
		for (int j = 0; j < list.length; j++) {
			for (int i = 0; i < N - 1-k; i++) {
				c++;
				if (list[i] > list[i + 1]) {
					temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

				}
			//	for (int p = 0; p < N; p++) {
				//	System.out.print(list[p]);

				//}
			//	System.out.println();
			}

		
			k++;

		}
		System.out.println(k);
		for (int i = 0; i < N; i++) {
			System.out.print(list[i]);
		}
		System.out.println();
		System.out.println(c);
	}
}
