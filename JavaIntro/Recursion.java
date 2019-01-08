package test.loops;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfRecursion = input.nextInt();
		long sum = sumOfRecursion(numberOfRecursion);
		System.out.println(sum);
		
		long fibonacci = fibonacciReqursion(numberOfRecursion);
		System.out.println(fibonacci);

	}

	private static long fibonacciReqursion(int numberOfRecursion) {
		if (numberOfRecursion == 0 ) {
			return 0;
		}
		if (numberOfRecursion == 1 ) {
			return 1;
		}
		return fibonacciReqursion(numberOfRecursion - 1) + fibonacciReqursion(numberOfRecursion -2);
		  //home work check fibonacci formula and create it without recursion
	}

	private static long sumOfRecursion(int numberOfRecursion) {
		if (numberOfRecursion == 1 ) {
			return 1;
		}
		return numberOfRecursion + (numberOfRecursion - 1);
	}

}
