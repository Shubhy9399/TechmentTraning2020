package com.techment;

import java.util.*;

public class LetterAtATime {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();   
		
		sc.close();
		int count=0;
		for(int i=0; i<=str.length()-1; i++) {
			count++;
		}
		System.out.println("The whole message consist of" + count + "characters");
		System.out.println("First character of the message is:" +str.charAt(0));
		System.out.println("last character of the message is:" +str.charAt(str.length()-1));
		System.out.println("Index of First character of the message is:" +str.indexOf(str.charAt(0)));
		System.out.println("Index of last character of the message is:" +str.indexOf(str.charAt(str.length()-1)));
		
		
        int counter = 0;  
        
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 'a') { 
            	//increasing the counter value at each occurrence of 'a'
                counter++;  
            }  
        }  
        System.out.println("Char 'a' occurred "+counter+" times in the message");  
	}

}
