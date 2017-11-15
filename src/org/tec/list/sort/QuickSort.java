package org.tec.list.sort;

public class QuickSort <T extends Comparable<T>> {

    public T[] sort(T[] arr) {
    	return sort(arr, 0, arr.length-1);
    }
    private T[] sort(T[] arr, int a, int b) {
    	if (a < b) {
    		int i = a, j = b;
    		T x = arr[(i + j) / 2];

    		do {
    			while (arr[i].compareTo(x) < 0) i++;
    			while (x.compareTo(arr[j]) < 0) j--;

    			if ( i <= j) {
    				T Swap = arr[i];
    				arr[i] = arr[j];
    				arr[j] = Swap;
    				i++;
    				j--;
    			}

    		} while (i <= j);

    		sort(arr, a, j);
    		sort(arr, i, b);
    	}
    	
    	return arr;
    }
 }