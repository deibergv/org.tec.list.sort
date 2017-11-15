package org.tec.list.sort;

public class BubbleSort <T extends Comparable<T>>{
	public T[] sort(T[] arr) {
		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				if (arr[j].compareTo(arr[i]) < 0) {
					T swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
		}
		return arr;
	}
}
