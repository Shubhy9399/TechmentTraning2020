package com.techment;

import java.util.Scanner;

//Exercise - Write a program to find whether a given 3-digit number is an Armstrong number or not.

/* author - SHUBHANGI
* 
*/

public class ArmstrongNum {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 3-digit Number");//Enter any 3 - digit Number
		int Number = s.nextInt();
		
		int t1 = Number;
		int leng=0;
		while (t1 != 0)
		{
			leng = leng + 1;
			t1 = t1/10;
		}
		
		int t2 = Number;
		int arm = 0 , rem;
		while (t2 != 0)
		{
			int mul = 1;
			rem = t2 % 10;
			for(int i = 1; i<leng; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2/10;
		}
		if(arm == Number) {
			System.out.println(Number + " is an Armstrong Number ");//  is an Armstrong Number 
		}
		else
		{
			System.out.println(Number + " is not an Armstrong Number ");// is not an Armstrong Number
		}
		s.close();
	}

}
