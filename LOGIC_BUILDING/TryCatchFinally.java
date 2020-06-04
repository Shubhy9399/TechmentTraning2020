package com.techment;

import java.util.*;

public class TryCatchFinally {
	 public static void main(String args[])
	   {	
		 Scanner s= new Scanner(System.in);
 		 System.out.println("Enter First number");
 		 int Num1=s.nextInt();
 		 System.out.println("Enter Second number");
 		 int Num2=s.nextInt();
    	  
 		  s.close();
	      try{
	         int output=Num1/Num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
	      finally {
	    	  System.out.println ("Inside finally block");
	      }
	   }
}
