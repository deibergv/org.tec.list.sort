//package org.tec.list.sort;
//
//public class MergeSort {
//	public static <T extends Comparable<T>> void mergeSort(T[] arr) {
//		Sort(arr, 0, arr.length - 1);
//	}
//
//	public static <T extends Comparable<T>> void merge(T[] arr, int l, int m, int r) {
//
//		// Find sizes of two subarrays to be merged
//		int n1 = m - l + 1;
//		int n2 = r - m;
//
//		/* Create temp arrays */
////		int L[] = new int[n1];
////		int R[] = new int[n2];
//
//		T[] a = arr;
//		T[] b = arr;
//
//		/* Copy data to temp arrays */
//		for (int i = 0; i < n1; ++i)
////			L[i] = arr[l + i];
//			a[i] = arr[l + i];
//		for (int j = 0; j < n2; ++j)
////			R[j] = arr[m + 1 + j];
//			b[j] = arr[m + 1 + j];
//
//		/* Merge the temp arrays */
//
//		// Initial indexes of first and second subarrays
//		int i = 0, j = 0;
//
//		// Initial index of merged subarry array
//		int k = l;
//		while (i < n1 && j < n2) {
////			if (a[i] <= b[j]) {
//			if (a[i].compareTo(b[j]) < 0) {
//				
//				
////				arr[k] = L[i];
//				arr[k] = a[i];
//				i++;
//			} else {
////				arr[k] = R[j];
//				arr[k] = b[j];
//				j++;
//			}
//			k++;
//		}
//
//		/* Copy remaining elements of L[] if any */
//		while (i < n1) {
////			arr[k] = L[i];
//			arr[k] = a[i];
//			i++;
//			k++;
//		}
//
//		/* Copy remaining elements of R[] if any */
//		while (j < n2) {
////			arr[k] = R[j];
//			arr[k] = b[j];
//			j++;
//			k++;
//		}
//	}
//
//	// Main function that sorts arr[l..r] using
//	// merge()
//	public static <T extends Comparable<T>> void Sort(T[] arr, int l, int r) {
//
//		if (l < r) {
//			// Find the middle point
//			int m = (l + r) / 2;
//
//			// Sort first and second halves
//			Sort(arr, l, m);
//			Sort(arr, m + 1, r);
//
//			// Merge the sorted halves
//			merge(arr, l, m, r);
//		}
//	}
//
//	//////////////////////// TEST //////////////////////////////////////
//	public static <E> void printArray(E[] list) {
//
//		for (int i = 0; i < list.length; i++) {
//			System.out.print(list[i] + ", ");
//		}
//	}
//
//	public static void main(String[] args) {
//		 Integer[] list = {34, 17, 23, 35, 45, 9, 1}; //tiene que ser Integer porque
//		// "int" es primitivo y no tiene Comparable
//		//String[] list = { "z", "c", "g", "f", "b", "a" };
//
//		System.out.println("Original Array: ");
//		printArray(list);
//
//		// selectionSort(list);
//		// bubbleSort(list);
//		// insertionSort(list);
//		// quickSort(list);
//		// shellSort(list);
//		mergeSort(list);
//		System.out.println("\n sort:");
//		printArray(list);
//	}
//}

package org.tec.list.sort;

import java.util.*;

public class MergeSort {

	// public static <T extends Comparable<T>> void mergeSort(T[] arr) {
		 public static <E> void Sort(E[] a, Comparator<? super E> comp) {
		mergeSort(a, 0, a.length - 1, comp);
	}

	private static <E> void mergeSort(E[] a, int from, int to, Comparator<? super E> comp) {
		if (from == to)
			return;
		int mid = (from + to) / 2;
		// Sort the first and the second half
		mergeSort(a, from, mid, comp);
		mergeSort(a, mid + 1, to, comp);
		merge(a, from, mid, to, comp);
	}

	private static <E> void merge(E[] a, int from, int mid, int to, Comparator<? super E> comp) {
		int n = to - from + 1;
		Object[] values = new Object[n];

		int fromValue = from;

		int middleValue = mid + 1;

		int index = 0;

		while (fromValue <= mid && middleValue <= to) {
			if (comp.compare(a[fromValue], a[middleValue]) < 0) {
				values[index] = a[fromValue];
				fromValue++;
			} else {
				values[index] = a[middleValue];
				middleValue++;
			}
			index++;
		}

		while (fromValue <= mid) {
			values[index] = a[fromValue];
			fromValue++;
			index++;
		}
		while (middleValue <= to) {
			values[index] = a[middleValue];
			middleValue++;
			index++;
		}

		for (index = 0; index < n; index++)
			a[from + index] = (E) values[index];
	}

	////////////////////////// TEST //////////////////////////////////////
	public static <E> void printArray(E[] list) {

		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + ", ");
		}
	}

	public static void main(String[] args) {
		Integer[] list = {34, 17, 23, 35, 45, 9, 1}; //tiene que ser Integer porque
		// "int" es primitivo y no tiene Comparable
//		String[] list = { "z", "c", "g", "f", "b", "a" };

		System.out.println("Original Array: ");
		printArray(list);

		// selectionSort(list);
		// bubbleSort(list);
		// insertionSort(list);
		// quickSort(list);
		// shellSort(list);
		// mergeSort(list);
		Comparator<Integer> comp = new Comparator<Integer>() {
			public int compare(Integer d1, Integer d2) {
		        return d1.compareTo(d2);
		      }
		    };
		}
	
		Sort(list, comp);
		
		System.out.println("\n sort:");
		printArray(list);
	}
}
