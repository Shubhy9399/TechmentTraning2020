package com.techment;

import java.util.*;

public class RightAngleTriangle {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first side of triangle");
		int Side1=sc.nextInt();
		System.out.println("Enter Second side of triangle");
		int Side2=sc.nextInt();
		System.out.println("Enter Third side of triangle");
		int Side3=sc.nextInt();
		
		if((Side1*Side1) + (Side2*Side2) == (Side3*Side3)) {
			System.out.println("This triangle is a Right Angle Triangle ");
		}
		else
		{
			System.out.println("This triangle is not a Right Angle Triangle ");
		}
		sc.close();
	}

}
