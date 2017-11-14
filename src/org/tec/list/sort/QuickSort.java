package org.tec.list.sort;

public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(T[] arr) {
    	Sort(arr, 0, arr.length-1);
    }
    public static <T extends Comparable<T>> void Sort(T[] arr, int a, int b) {
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

            Sort(arr, a, j);
            Sort(arr, i, b);
        }
    }
 }