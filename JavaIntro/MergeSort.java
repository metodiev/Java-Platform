package com.sort;

public class MergeSort {

	public static void main(String[] args) {
		int numbers[] = { 38, 27, 43, 3, 9, 82, 10 };

		sortMergeSort(numbers, numbers.length);

		for (int i : numbers) {
			System.out.println(i);
		}

	}

	private static void sortMergeSort(int[] numbers, int len) {

		if (len < 2) {
	        return;
	    }
		int lArr = numbers.length;
		int lefts = numbers.length % 2;
		int pivot = numbers.length / 2;

		// System.out.println(lefts);

		// create two arrays

		int[] leftArr = new int[pivot];
		int[] rightArr = new int[pivot + lefts];

		// add to left Arr
		for (int i = 0; i < pivot; i++) {
			leftArr[i] = numbers[i];
			//System.out.println(leftArr[i]);
		}

		// add to right Arr
		for (int j = 0, i = pivot; i < numbers.length; i++, j++) {
			rightArr[j] = numbers[i];
			//System.out.println(rightArr[j]);
		}
		
		sortMergeSort(leftArr, pivot);
		sortMergeSort(rightArr, pivot + lefts);
		merge(numbers, leftArr, rightArr);
		
		
		//return numbers;
	}

	public static void merge(int[] numbersArr, int[] leftArr, int[] rightArr) {

		int leftCounter = 0;
		int rightCounter = 0;
		int numberCounter = 0;

		while (leftCounter < leftArr.length && rightCounter < rightArr.length) {
			if (leftArr[leftCounter] <= rightArr[rightCounter]) {

				numbersArr[numberCounter++] = leftArr[leftCounter++];
			} else {
				numbersArr[numberCounter++] = rightArr[rightCounter++];
			}

		}
		while (leftCounter < leftArr.length) {
			numbersArr[numberCounter++] = leftArr[leftCounter++];

		}
		while (rightCounter < rightArr.length) {
			numbersArr[numberCounter++] = rightArr[rightCounter++];
		}

	}

}
