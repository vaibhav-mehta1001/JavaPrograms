package Searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = { 23, 345, 32, 90, 1, 4, 66, 4, 32 };
		a = bubbleSort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(binary(a, 345) + 1);

	}

	public static int[] bubbleSort(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 -i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
				}
			}

		}
		System.out.println(count);
		return a;
	}

	public static int[] selectionSort(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[j] < a[index])
					index = j;
				count++;

			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;

		}
		System.out.println(count);
		return a;
	}

	public static int binary(int[] a, int key) {
		int lo = 0;
		int log = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			log++;
			// Key is in a[lo..hi] or not present.
			int mid = (lo + hi) / 2;

			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else {
				System.out.println(log);
				return mid;
			}
		}
		return -1;
	}

}
