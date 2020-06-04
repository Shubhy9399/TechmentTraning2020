package com.techment;

import java.util.*;

public class FirstNterms {

	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number");
		int s=sc.nextInt();
		
		for(int i=1;i<=s;i++) {
			int d=i*i*i;
			System.out.println(d);
		}
		 sc.close();
	}
	 
}
