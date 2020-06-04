package com.techment;

import java.util.*;
public class CompareTwoArrays {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of 1st array:");
		int size=sc.nextInt();
		int array1[]= new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element:");
			array1[i]=sc.nextInt();
		}
		for (int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		
		System.out.println("Enter the size of 2nd array:");
		int length=sc.nextInt();
		int array2[]= new int[length];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element:");
			array2[i]=sc.nextInt();
		}
		for (int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		sc.close();
		
		
		for(int i=0;i<array1.length;i++) {
		
			for(int j=0;i<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println("Array1 and Array2 are same");
				}
				else {
					System.out.println("Array1 and Array2 are different");
				}
			}
		}
		
	}

}
