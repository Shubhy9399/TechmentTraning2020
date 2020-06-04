package com.techment;
import java.util.*;

public class SortingArrayList {
	 public static void main(String[] args) {
	            
		  ArrayList<String> name = new ArrayList<String>();
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("how many names you want to add:");
		   int size =sc.nextInt();
		    System.out.println("Enter Names:");
		    
	         for(int i=1;i<=size;i++) {
	        	 
	        	  name.add(sc.next());
	          
	        }
	         System.out.println("Names are:"+name);
	         
	         Collections.sort(name);
	         System.out.println("Sorted names are:"+name);
	 }
}
