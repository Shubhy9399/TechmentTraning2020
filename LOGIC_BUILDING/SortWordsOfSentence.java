package com.techment;

import java.lang.String;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SortWordsOfSentence {

	public static void main(String[] args) throws IOException{
      
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a sentence : ");
		String sentence = br.readLine();

		String[] arrOfWords = sentence.split(" ");
		Arrays.sort(arrOfWords);
		for(int i=0; i<arrOfWords.length;i++) {

			System.out.println(arrOfWords[i]);
		}


	}

}