package com.techment;

import java.util.*;

public class DiceGame {
	
		public static void main(String[] args) {
		
			Random rand=new Random();
			int upperbound=6;
			int dice1 = rand.nextInt(upperbound);
			int dice2 = rand.nextInt(upperbound);
			int difference;
			dice1 += 1;
			dice2 += 1;
			System.out.println("Roll Dice : \nNumber is : " + dice1  );
			System.out.println("Roll Dice Again: \nNumber is: "+dice2);
			if( (dice1 % 2) == 0 && (dice2 % 2) == 0)		
				System.out.println("Points : " + (dice1 + dice2 ));
			
			else 
			{
				if(dice1>dice2)
					difference = dice1 - dice2;
				else
					difference = dice2 - dice1;
				System.out.println("Points : "+ difference);
			}
	}

}
