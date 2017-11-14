package org.tec.list.sort;

public class ShellSort {

	public static <T extends Comparable<T>> void shellSort(T[] arr) {
		{
			int j;
			for (int gap = arr.length / 2; gap > 0; gap /= 2) {
				for (int i = gap; i < arr.length; i++) {
					T Swap = arr[i];
					for (j = i; j >= gap && Swap.compareTo(arr[j - gap]) < 0; j -= gap) {
						arr[j] = arr[j - gap];
					}
					arr[j] = Swap;
				}
			}
		}
	}
}