package com.techment;

import java.util.*;

public class Pattern19 {
	
	public static void main(String args[]) {
		  Scanner sc = new Scanner(System.in);
	         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	        int count=rows;//initializing count with rows
	        for (int i=0; i<=rows; i++){
	          for (int j=1; j<=i*2; j++){
	          System.out.print(" ");
	          }//print space at the beginning of each row
	         
	        for(int j=1; j<=count; j++) {
	        System.out.print(j+" ");//print left part of pyramid
	        }
	        for(int j=count-1; j>=1; j--) {
	        System.out.print(j+" "); //print right part of pyramid
	        }
	          System.out.println();   
	        count--;  
	        sc.close();
	   }
	}
}
