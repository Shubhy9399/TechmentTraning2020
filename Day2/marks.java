package Dayprograms;

import java.util.*;
public class marks {
	public static void main(String args[])
	{
		
		
		int Marks[] = {34,67,66,37,28,69}; 
		
	
	int max = Marks[0],min = Marks[0];
	
	 for(int i=1; i<Marks.length;i++)
	 {
		 if(Marks[i] > max)
		 {
			 max = Marks[i];
		 }
		 if(Marks[i] < min)
		 {
			 min = Marks[i];
		 }
	 }
     System.out.println("Max is"+max);
     System.out.println("Min is"+min);
	}	
}
