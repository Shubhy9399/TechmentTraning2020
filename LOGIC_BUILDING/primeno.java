package com.techment;

import java.util.Scanner;

public class primeno {
	
	public static boolean isPrime(int number)
	{
	for (int i =2 ;i<= number/2 ; i++)
	{
		if (number % i == 0)
		{
			return false;
		}
	}
	return true;
	}
	
	
	public static void main(String args[])
	{
		int number;
		int count =1;
		int startNumber = 1;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number");
		number  = sc.nextInt();
		
		while (count <= number)
		{
			startNumber++;
		if(primeno.isPrime(startNumber)) {
			System.out.println(startNumber);
			count++;
		}
		 sc.close();
         
		}
	}
}
