package programs;

import java.util.*;

 public class ExitDoor
{  
   public static void main(String args[])
    
    {  
        
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the door number");
        int n=s.nextInt();

        if(n < 1 || n > 18) { 

            System.out.println("Invalid Door Number"); 
                }
        else
        {  
            // Finding the first digit of DoorNumber
            int first = n / 10;  
              
            // Finding the last digit of DoorNumber
            int last = n % 10;  
              
            // Finding the sum  of the digits of DoorNumber
            int sum = first + last;  
              
            // Finding the product of the digits of DoorNumber
            int pro = first * last;  
              
            if((sum + pro) == n) 
            { 
                System.out.println(n + " is a Special" +  
                                   " Two-Digit Number"); 
            } 
            else
            { 
                System.out.println(n +" is Not a Special" +  
                                      " Two-Digit Number"); 
            } 
        } 
    } 
      
  
} 