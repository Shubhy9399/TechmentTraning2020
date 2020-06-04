package com.techment;
//Exercise - : Write a program to accept a year value as input and display if the year is a leap year or not

/*author - SHUBHANGI
 * 
 */

import java.util.*;

public class LeapYear {
	
	public static void main(String args[]) {
		
		//Enter any Year
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Year");
		int Year = s.nextInt();
		
		if((Year % 400 == 0)||(Year % 4 == 0 && Year % 100 != 0))
		{
			System.out.println("This is a Leap Year");//Leap Year
		}
		else
		{
			System.out.println("This is a Not a Leap Year");//Not a Leap Year
		}
		  s.close();
		
	}

}
