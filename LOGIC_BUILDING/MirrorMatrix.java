package com.techment;

 import java.util.*;
 
public class MirrorMatrix {
	public static void main(String args[]) {
	Scanner s= new Scanner(System.in); 

	int row,column;
	System.out.print("Enter number of rows in matrix : ");
	row = s.nextInt();
	System.out.print("Enter number of columns in matrix :");
	column = s.nextInt();


	int matrix[][]=new int[row][column];
	
	System.out.println("Enter the elements in matrix :");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++) 
		{
			matrix[i][j]=s.nextInt();

		}

	}

	System.out.println("The entered elements are :");
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++) 
		{
			System.out.print(matrix[i][j] + " ");

		}
		System.out.println();

	}
	
	System.out.println("The mirror image of matrix is :");
	for(int i=0;i<column;i++)
	{
		for(int j=row-1;j>=0;j--) 
		{
			System.out.print(matrix[i][j] + " ");

		}
		System.out.println();

	}

    s.close();
 }
}
