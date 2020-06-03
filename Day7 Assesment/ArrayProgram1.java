package com.tehment;
public class ArrayProgram1{
	public static void main(String args[]){
	   int a[] = { 2, 6, 7, 9, 4 }; 
        int even = 0, odd = 0; 
  
        for (int i = 0; i < a.length; i++)
         { 
            if (i % 2 == 0) 
                even= even + a[i]; 
            else
                odd= odd + a[i]; 
        } 
  
        System.out.println("Even sum: " + even); 
        System.out.println("Odd sum: " + odd); 
	}
}