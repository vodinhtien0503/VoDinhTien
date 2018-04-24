package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;

// Write a Java program to get the last date of the month
public class bai8 {

	public static void main(String[] args) {
		 Calendar cal = Calendar.getInstance();
		  System.out.println();
	        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println(cal.getTime());
			System.out.println();

	}

}
