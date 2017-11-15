package org.tec.list.sort.test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.

import org.tec.list.sort.BubbleSort;
import org.tec.list.sort.InsertionSort;
import org.tec.list.sort.MergeSort;
import org.tec.list.sort.QuickSort;
import org.tec.list.sort.SelectionSort;
import org.tec.list.sort.ShellSort;

class Test {
	
	public BubbleSort<Integer> bubbleSort = new BubbleSort<>();
	public InsertionSort<Integer> insertionSort = new InsertionSort<>();
	public MergeSort<Integer> mergeSort = new MergeSort<>();
	public QuickSort<Integer> quickSort = new QuickSort<>();
	public SelectionSort<Integer> selectionSort = new SelectionSort<>();
	public ShellSort<Integer> shellSort = new ShellSort<>();
	public BubbleSort<String> bubbleSortString = new BubbleSort<>();
	public InsertionSort<String> insertionSortString = new InsertionSort<>();
	public MergeSort<String> mergeSortString = new MergeSort<>();
	public QuickSort<String> quickSortString = new QuickSort<>();
	public SelectionSort<String> selectionSortString = new SelectionSort<>();
	public ShellSort<String> shellSortString = new ShellSort<>();
	public Integer[] intArray = {9,100,45,1,-2,0};
	public String[] stringArray = {"K","a","e","hola","que?","!ja!"};
	public Integer[] postArray = {-2,0,1,9,45,100};
	public String[] postStringArray = {"!ja!","K","a","e","hola","que?"};
	
	@org.junit.jupiter.api.Test
	void bubbleSortIntTest() {
		assertArrayEquals(postArray,bubbleSort.sort(intArray));
	}
	
	@org.junit.jupiter.api.Test
	void bubbleSortStringTest() {
		assertArrayEquals(postStringArray,bubbleSortString.sort(stringArray));
	}
	
	@org.junit.jupiter.api.Test
	void insertionSortTest() {
		assertArrayEquals(postArray,insertionSort.sort(intArray));
	}
	
	@org.junit.jupiter.api.Test
	void insertionSortStringTest() {
		assertArrayEquals(postStringArray,insertionSortString.sort(stringArray));
	}
	
	@org.junit.jupiter.api.Test
	void mergeSortTest() {
		assertArrayEquals(postArray,mergeSort.sort(intArray));
	}

	@org.junit.jupiter.api.Test
	void mergeSortStringTest() {
		assertArrayEquals(postStringArray,mergeSortString.sort(stringArray));
	}
	
	@org.junit.jupiter.api.Test
	void quickSortTest() {
		assertArrayEquals(postArray,quickSort.sort(intArray));
	}
	
	@org.junit.jupiter.api.Test
	void quickSortStringTest() {
		assertArrayEquals(postStringArray,quickSortString.sort(stringArray));
	}
	
	@org.junit.jupiter.api.Test
	void selectionSortTest() {
		assertArrayEquals(postArray,selectionSort.sort(intArray));
	}
	
	@org.junit.jupiter.api.Test
	void selectionSortStringTest() {
		assertArrayEquals(postStringArray,selectionSortString.sort(stringArray));
	}
	
	@org.junit.jupiter.api.Test
	void shellSortTest() {
		assertArrayEquals(postArray,shellSort.sort(intArray));
	}
	
	@org.junit.jupiter.api.Test
	void shellSortStringTest() {
		assertArrayEquals(postStringArray,shellSortString.sort(stringArray));
	}
}
