package com.techment;

 import java.util.*;
 
public class HeronsFormula {
   
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first side of a triangle:");
		int side1=s.nextInt();
		System.out.println("Enter second side of a triangle:");
		int side2=s.nextInt();
		System.out.println("Enter third side of a triangle:");
		int side3=s.nextInt();
		
		float sides=(side1 + side2 + side3)/2;
		double area=Math.sqrt(sides*(sides-side1)*(sides-side2)*(sides-side3));
		
		System.out.println("Area of triangle is:" +area);
		s.close();
	}
}
