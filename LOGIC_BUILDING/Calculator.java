package com.techment;
//Exercise -: Write a program to accept two numbers and an operator to perform mathematical operation on the operands and display the result as output.

/* author - SHUBHANGI
* 
*/
import java .util.*;

public class Calculator {
public static void main(String args[])
{
	String yn; do
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First no.");//Enter first no.
		int no1 = s.nextInt();
		System.out.println("Enter Second no.");//Enter second no.
		int no2 = s.nextInt();
		int res;
		System.out.println("Select a symbol('+','-','*','/')");//Select a symbol
		String sym = s.next();
		
		  s.close();
		switch(sym)
		{
			case "+": res = no1 + no2;
			System.out.println("Addition is:" + res);break;//addition
			case "-": res = no1 - no2;
			System.out.println("Subtraction is:" + res);break;//subtraction
			case "*": res = no1 * no2;
			System.out.println("Multiplicaion is:" + res);break;//Multiplication
			case "/": res = no1 / no2;
			default:System.out.println("invalid symbol");//default
			break;
			
	    }
		System.out.println("Do you want to continue?(if yes press 'y' or if no press 'n')");
		yn = s.next();
	}
	while(yn.equals("y") || yn.equals ("Y"));
	  
}
}
