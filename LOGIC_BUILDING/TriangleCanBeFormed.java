package com.techment;

import java.util.*;

public class TriangleCanBeFormed {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first side of a triangle A:");
		int a=sc.nextInt();
		System.out.println("Enter second side of a triangle B:");
		int b=sc.nextInt();
		System.out.println("Enter Third side of a triangle C:");
		int c=sc.nextInt();
		
		 if (a + b <= c || a + c <= b || b + c <= a) 
	            System.out.print("Triangle can be formed"); 
	        else
	            System.out.print("Triangle can't be formed"); 
	          
	    sc.close();
	}
}
