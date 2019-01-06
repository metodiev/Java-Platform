package com.java.math.operations;

import java.util.Scanner;

public class MathematicalOperations {

	public static void main(String[] args) {
		
		//in java Console readline is Scanner
		Scanner input = new Scanner(System.in);
		
		//syso and ctrl + space 
		System.out.println("Enter two numbers");
		
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		
		System.out.println(sumTwoNumbers(numberOne, numberTwo));
		//Home work write logics with another operations
        //use methods

	}

	private static int sumTwoNumbers(int numberOne, int numberTwo) {
		if ((numberOne < 0 || numberTwo < 0)) {
			System.out.println("Invalid input");
			return 0;
		}
		return numberTwo + numberOne;

	}

}
