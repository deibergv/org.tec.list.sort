package org.tec.list.sort;

public class BubbleSort {
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {		
		
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[j].compareTo(arr[i]) < 0) {
					T Swap = arr[i];
					arr[i] = arr[j];
					arr[j] = Swap;
				}
			}
		}
	}
}
