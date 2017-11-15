package org.tec.list.sort;

public class MergeSort <E extends Comparable<E>>{
	public E[] sort(E[] a) {
		return mergeSort(a, 0, a.length - 1);
	}

	private E[] mergeSort(E[] a, int from, int to) {
		if (from == to) {
			return a;
		} else {
		int mid = (from + to) / 2;
		mergeSort(a, from, mid);
		mergeSort(a, mid + 1, to);
		return merge(a, from, mid, to);
		}
	}

	private E[] merge(E[] a, int from, int mid, int to) {
		int n = to - from + 1;
		Object[] values = new Object[n];

		int fromValue = from;
		int middleValue = mid + 1;
		int index = 0;

		while (fromValue <= mid && middleValue <= to) {
			if (a[fromValue].compareTo(a[middleValue]) < 0) {
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

		for (index = 0; index < n; index++) {
			a[from + index] = (E) values[index];
		}
		
		return a;
	}
}