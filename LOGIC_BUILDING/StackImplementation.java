package com.techment;

import java.util.*;

public class StackImplementation {
	public static void main(String[] args) {
    
		Scanner s= new Scanner(System.in);

		Stack <Integer> Elements = new Stack <Integer>();
		int array[] = new int[5];
		
		System.out.println("Enter five elements : ");
		for( int i=0;i<5;i++){
			array[i]=s.nextInt();
			Elements.push(array[i]);
		}
		System.out.println("Elemets pushed into stack are :" + Elements);
		
		System.out.println("Elements popped from stack : ");
		for( int i=0;i<5;i++){
			System.out.println("Item popped is : " + Elements.pop());
		}
		s.close();
	}
}
