package com.techment;

import java.util.*;

public class BattleSoldiers {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("The first soldier :");
		int firstSoldierNumber =sc.nextInt();
		System.out.print("The last soldier :");
		int lastSoldierNumber =sc.nextInt();
		
		System.out.println("Soldiers come forward:");
		for(int i=firstSoldierNumber;i<=lastSoldierNumber;i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
