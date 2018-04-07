package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.Year;

// Write a Java program to get the information of current/given year.

public class bai25 {

	public static void main(String[] args) {
		
		 Year yr = Year.now();
	     System.out.println("\nCurrent Year: " + yr);  
	     boolean isLeap = yr.isLeap();
	     System.out.println("Is current year leap year? " + isLeap);  
	     int length = yr.length();
	     System.out.println("Length of the year: " + length+" days\n");

	}

}
