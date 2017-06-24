package java_Assignment21;

/*
 * This class will help you to master the Conditional Statements Relational Operators
 * This class will find the highest among the given 3 numbers.
 */

import java.util.*;

public class Java_Assignment2_1 {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);  // Scanner object to take the input from the user.
		
		//declaring all the variables 
		float FirstNumber;
		float SecondNumber;
		float ThirdNumber;
		float HighestNumber;
		
		HighestNumber =0; //initializing the highest number to zero
		
		System.out.println("Enter the first number:");
		FirstNumber = Sc.nextFloat(); // Accepting the user input for the first number
		
		System.out.println("Enter the second number:");
		SecondNumber = Sc.nextFloat();// Accepting the user input for the second number
		
		System.out.println("Enter the third number:");
		ThirdNumber = Sc.nextFloat();// Accepting the user input for the third number
		
		if (FirstNumber >= SecondNumber)
		{
			HighestNumber = FirstNumber;
		}
		else
		{
			HighestNumber = SecondNumber;
		}
		
		if (HighestNumber  < ThirdNumber)
		{
			HighestNumber = ThirdNumber;
		}

		
		System.out.println("The highest number among the 3 input is:" + HighestNumber );
		Sc.close();
	}

}
