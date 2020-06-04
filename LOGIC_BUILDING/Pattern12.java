package com.techment;
/* author -  SHUBHANGI
 * 
 */
//Exercise - Write a program to print the below pattern.

//        5 
//      4 5 4 
//    3 4 5 4 3 
//  2 3 4 5 4 3 2 
//1 2 3 4 5 4 3 2 1 


public class Pattern12 {

		public static void main(String args[])
		{
			for(int i=1; i<=5 ;i++) 
			{
				for(int j=5 ; j>=i ; j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print(k);
				}
				for(int l=4;l<=i;l++)
				{
					System.out.print(l);
				}
				
				System.out.println();
		    }
	   }
}
	

