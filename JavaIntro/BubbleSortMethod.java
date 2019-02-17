package com.sort;

public class BubbleSortMethod {

	public static void main(String[] args) {
		int[] numbers = { 4, 100, 2, 400, 1, 500, 9, 3, 12 };

		// Bubble sort
		bubbleSort(numbers);
		
		for (int i : numbers) {
			System.out.println(i);
		}

	}

	private static int[] bubbleSort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {

			for (int k = 0; k < numbers.length - i - 1; k++) {

				if ((numbers[k] > numbers[k + 1])) {
					int temp = numbers[k+1];
					numbers[k+1] = numbers[k];
					numbers[k] = temp;

				}
			}

		}

		return numbers;

	}

}
