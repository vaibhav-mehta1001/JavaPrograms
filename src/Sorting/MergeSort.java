package Sorting;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ab = 'A';
		int x = 32;
		System.out.println((char)(ab+x+2));
		System.out.println("Four :"+4+2);String  S = "ABCDE";
		System.out.println(S.compareTo("CDEFKL"));
				
		// TODO Auto-generated method stub
		int a[] = { 565, 90, 86, 65 };
		mergeSort(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void mergeSort(int[] list, int lowIndex, int highIndex) {
		if (lowIndex == highIndex)
			return;
		else {
			int midIndex = (lowIndex + highIndex) / 2;
			mergeSort(list, lowIndex, midIndex);
			mergeSort(list, midIndex + 1, highIndex);
			merge(list, lowIndex, midIndex, highIndex);
		}
	}

	public static void merge(int[] list, int lowIndex, int midIndex,
			int highIndex) {
		int[] L = new int[midIndex - lowIndex + 2];

		for (int i = lowIndex; i <= midIndex; i++) {
			L[i - lowIndex] = list[i];
		}
		L[midIndex - lowIndex + 1] = Integer.MAX_VALUE;
		int[] R = new int[highIndex - midIndex + 1];

		for (int i = midIndex + 1; i <= highIndex; i++) {
			R[i - midIndex - 1] = list[i];
		}
		R[highIndex - midIndex] = Integer.MAX_VALUE;
		int i = 0, j = 0;

		for (int k = lowIndex; k <= highIndex; k++) {
			if (L[i] <= R[j]) {
				list[k] = L[i];
				i++;
			} else {
				list[k] = R[j];
				j++;
			}
		}
	}
}
