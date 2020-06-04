package com.techment;

import java.util.Scanner;

class AgeException extends Exception{
	
	public AgeException(String str) {
		System.out.println(str);
	}
}

public class TryCatch {
	public static void main(String args[]) {
		
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter any Age");
	    int Age=s.nextInt();
	    
	    s.close();
	    
	    try {
	    if(Age<18)
	    {
	    	throw new AgeException("Invalid Age");
	    }
	    	else {
	    	System.out.println("Welcome to Vote!");
	    }
	    	    
	    }
	    catch(AgeException a)
	    {
	    	System.out.println("Exception Occured:"+a);
	    }
	  
        
		
		}
}
