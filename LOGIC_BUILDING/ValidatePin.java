package com.techment;

import java.util.Scanner;

public class ValidatePin {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int Pin=0;
		int Correct_Pin=12345;
		
		while(true) {
			
		System.out.print("Enter your Pin:");
	    Pin=sc.nextInt();
	    if(Pin != Correct_Pin) 
			System.out.println("Invalid PIN!!! TRY AGAIN");
		else
			break;
			
		}
		System.out.println("Pin Accepted!");
		
		
		sc.close();
	}

}
