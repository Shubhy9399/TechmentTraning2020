package com.techment;

import java.util.*;

public class AccountLocked {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		
		int correct_pin=12345,attempt=0,pin=0;
		
		while(attempt<3) {
			attempt++;
			System.out.print("Enter your Pin:");
			 pin=s.nextInt();
			
			if((attempt<=2)&&(pin!=correct_pin)) {
				System.out.println("Your Pin is Incorrect ...Try Again!!");
			}
				else if(pin == correct_pin){
					System.out.println("PIN ACCEPTED");
				}
			}
		if((attempt == 3)&&(pin != correct_pin)) {
			System.out.println("You are run out of tries....\n ACCOUNT LOCKED!");
		}
		s.close();
	}
}

