package com.techment;

import java.util.*;

public class DivisibleBy8and3 {
	public static void main(String args[]) {
	
	Scanner s= new Scanner(System.in);
    System.out.println("Enter any Amount");
    int Amount=s.nextInt();
    
    if(Amount%8==0 && Amount%3==0) {
    	System.out.println("This Amount is divisible by both 8 and 3");
    }
    else
    {
    	System.out.println("This Amount is not divisible by both 8 and 3");
    }
    s.close();
	
	}

}
