package com.techment;
/* author -  SHUBHANGI
 * 
 */
//Exercise - Write a�program to print the above pattern. Use nested for loop.
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1


public class Pattern11 {

		public static void main(String args[])
		{
			//Nested for loop
			for (int i = 5; i >= 1; i--)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");//print the pattern
	            }
	             
	            System.out.println();
	        }
		}
}
	
