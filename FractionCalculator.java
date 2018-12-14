/**
 * @(#)FractionCalculator.java
 * @???????????????????????????????????? 
 * @version 1.00 2018/12/13
 */

import java.util.Scanner;

public class FractionCalculator
{   
    public static void main(String[]args)
    {
    	Scanner scan = new Scanner (System.in);	
    		
		double One, Two, Three, Four, Five, Six;
		String operation;
		One = .5; //  1/2
		Two = .25;//  1/4
			
		System.out.println("You can add, multiply, subtract or divide the fractions '1/2' and '1/4'\nWhat do you want to do?");
		operation = scan.nextLine();

		if (operation.equalsIgnoreCase ("add"))
        {
            System.out.println("your answer is 3/4" );
        }
		if (operation.equalsIgnoreCase ("subtract"))
        {
            System.out.println("your answer is 1/4" );
        }

		if (operation.equalsIgnoreCase ("divide"))
        {
            System.out.println("your answer is 2/1");
        }
		if (operation.equalsIgnoreCase ("multiply"))
        {
            System.out.println("your answer is 1/8");
        }
    }
}