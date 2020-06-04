package programs;
import java.util.*;

public class Day {
	 public static void main(String[] args)
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any Date ");
	        int day = s.nextInt();

	        System.out.println(getDayName(day));

	        if(day%2==0){
	        	System.out.println("Cars with Even registration numbers are permitted today");
	        }
	        else
	        {
	        	System.out.println("Cars with Odd registration numbers are permitted today");
	        }
	    }

	    // Get the name for the Week
	    public static String getDayName(int day) {
	        String dayName = "";
	        switch (day) {
	            case 1: dayName = "Monday"; break;
	            case 2: dayName = "Tuesday"; break;
	            case 3: dayName = "Wednesday"; break;
	            case 4: dayName = "Thursday"; break;
	            case 5: dayName = "Friday"; break;
	            case 6: dayName = "Saturday"; break;
	            case 7: dayName = "Sunday"; break;
	            case 8: dayName = "Monday"; break;
	            case 9: dayName = "Tuesday"; break;
	            case 10: dayName = "Wednesday"; break;
	            case 11: dayName = "Thursday"; break;
	            case 12: dayName = "Friday"; break;
	            case 13: dayName = "Saturday"; break;
	            case 14: dayName = "Sunday"; break;
	            case 15: dayName = "Monday"; break;
	            case 16: dayName = "Tuesday"; break;
	            case 17: dayName = "Wednesday"; break;
	            case 18: dayName = "Thursday"; break;
	            case 19: dayName = "Friday"; break;
	            case 20: dayName = "Saturday"; break;
	            case 21: dayName = "Sunday"; break;
	            case 22: dayName = "Monday"; break;
	            case 23: dayName = "Tuesday"; break;
	            case 24: dayName = "Wednesday"; break;
	            case 25: dayName = "Thursday"; break;
	            case 26: dayName = "Friday"; break;
	            case 27: dayName = "Saturday"; break;
	            case 28: dayName = "Sunday"; break;
	            case 29: dayName = "Monday"; break;
	            case 30: dayName = "Tuesday"; break;
	            case 31: dayName = "Wednesday"; break;
	           

	            default:dayName = "Invalid day";
	        }
	        return  dayName;
	    }
}
