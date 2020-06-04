package com.techment;

//Exercise - Write a program to find whether a given 3-digit number is an Armstrong number or not.

/* author - SHUBHANGI
* 
*/

import java.util.Scanner;
public class MyBirthMonth {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

       
        String MonthOfName = "Unknown";

        System.out.print("Enter a month number: ");//Enter any number
        int month = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                break;
            case 2:
                MonthOfName = "February";              
                break;
            case 3:
                MonthOfName = "March";                
                break;
            case 4:
                MonthOfName = "April";                 
                break;
            case 5:
                MonthOfName = "May";               
                break;
            case 6:
                MonthOfName = "June";                
                break;
            case 7:
                MonthOfName = "July";               
                break;
            case 8:
                MonthOfName = "August";               
                break;
            case 9:
                MonthOfName = "September";               
                break;
            case 10:
                MonthOfName = "October";               
                break;
            case 11:
                MonthOfName = "November";               
                break;
            case 12:
                MonthOfName = "December";
                break;
                
            default: System.out.println(" Invalid Month");//Print Invalid month
                break;
              
        }
        System.out.print("Your Birthday is in "+ MonthOfName);//Print BirthDay Month
        input.close();
    }
}
