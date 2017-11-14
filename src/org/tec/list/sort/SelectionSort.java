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
// }
	////////////////////////// TEST //////////////////////////////////////
	public static <E> void printArray(E[] list) {

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}
	}

	public static void main(String[] args) {
		// Integer[] list = {34, 17, 23, 35, 45, 9, 1}; //tiene que ser Integer porque
		// "int" es primitivo y no tiene Comparable
		String[] list = { "z", "c", "g", "f", "b", "a" };

		System.out.println("Original Array: ");
		printArray(list);

		selectionSort(list);
//		bubbleSort(list);
//		insertionSort(list);
//		quickSort(list);
//		shellSort(list);
		System.out.println("\n sort:");
		printArray(list);
	}
}
