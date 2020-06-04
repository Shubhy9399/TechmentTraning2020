package programs;

import java.util.*;
public class BestHorse
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weights of the horses");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();

		if(a>b && a>c)
		{
			System.out.println(" Horse a has Maximum weight");
		}
		else if(b>a && b>c)
		{
           System.out.println("Horse b has Maximum weight");
		}
		else if(a==b || b==c || c==a)
		{
			System.out.println("Entered weights are not distinct values");
		}
		else{
			System.out.println("Horse c has Maximum weight");
		}
	}
}