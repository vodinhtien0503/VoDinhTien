package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;

// Write a Java program to get a day of the week of a specific date
public class bai13 {
	public static void main(String [] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println();
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of the week: "+dayOfWeek);
	}
}
