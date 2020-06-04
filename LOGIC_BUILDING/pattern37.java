package com.techment;

import java.util.Scanner;

public class pattern37 {
	    	
	    	public static void main(String[] args) {
	    		 Scanner sc = new Scanner(System.in);
	             
	    	        //Taking rows value from the user
	    	         
	    	        System.out.println("How many rows you want in this pattern?");
	    	         
	    	        int rows = sc.nextInt();
	    	         
	    	        System.out.println("Here is your pattern....!!!");
	    	        sc.close();
	 	           
	    	         
	            for (int i = 1; i <= 5; i++)
	            {
	       
	                for (int j = 1; j<= rows - i; j++){
	                	System.out.print(" "); 
	                	} 
	                for (int k = i; k >= 1; k--){
	                    System.out.print(k);
	                }
	                for (int l = 2; l <= i; l++){
	                	System.out.print(l);
	                	}
	                System.out.println();
	                }
	            for (int i = rows-1; i >= 1; i--){
	                for (int j = 0; j<= rows-1 - i; j++){
	                	System.out.print(" "); 
	                	} 
	                for (int k = i; k >= 1; k--)
	                {
	                    System.out.print(k);
	                }
	                for (int l = 2; l <= i; l++)
	                {
	                    System.out.print(l);
	                }
	       
	                System.out.println();
	            }
	           
	        }
	}
