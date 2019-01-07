package test.loops;

import java.util.Scanner;

public class Loops {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
        int number = input.nextInt();
        forLoop(number);
        whileCycle(number);
        doWhileCycle(number);

        //Home work reverse all cycles
	}

	private static void doWhileCycle(int number) {
		 do
         {
            System.out.println(number);
             number--;
         } while (number > 0);
		
	}

	private static void whileCycle(int number) {
		 while (number > 0)
         {
            System.out.println(number);
             number--;
         }
		
	}

	private static void forLoop(int number) {
		 for (int i = 0; i < number; i++)
         {
             System.out.println(i);
         }
	}

}
