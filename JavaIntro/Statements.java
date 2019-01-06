package com.java.math.operations;

import java.util.Scanner;

public class Statements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter your current age");
         int age = input.nextInt();

        int intReturmStatement = checkUserAge(age);
 
         switch (intReturmStatement)
         {
             case 0:
                 printAllowSiteMessage();
                 break;

             case -1:
                 printWarningSiteMessage();
                 break;

             default:
                 break;
         }

         //switch statment choice number
         System.out.println("Enter a number:");
         int number = input.nextInt();

         switch (number)
         {
             case 1:
                 System.out.println("one");
                 break;

             case 2:
                 System.out.println("Two");
                // Console.ReadLine();
                 break;

             case 3:
                 System.out.println("Three");
                 break;

             case 4:
                 System.out.println("Four");
                 break;

             default:
                 break;
         }

         switch (number)
         {
             case 1:
                 System.out.println("One");
                 break;
             case 2:

             case 3:
              

             case 4:
                 System.out.println("Four");
                
                 break;
   
         }

        //Home work write a couple if and switch statements
	}

	private static int checkUserAge(int age) {

		if (age >= 18) {
			return 0;
		}

		return -1;

	}
	
	  //warning site message
    private static void printWarningSiteMessage()
    {
        System.out.println("Warning you dont have enougn age to be here please visit www.cartoonnetwork.com");
    }

    //sucessfull site message
    private static void printAllowSiteMessage()
    {
    	System.out.println("Sucessfull login");
    }

}
