package org.tec.list.sort;

public class SelectionSort {

	public static <T extends Comparable<T>> void selectionSort(T[] arr) {

		for (int i = 0; i < arr.length - 1; ++i) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			T Swap = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = Swap;
		}
	}
 }