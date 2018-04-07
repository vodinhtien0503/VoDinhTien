package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Write a Java program to get today's date at midnight time
public class bai34 {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
	      cal.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
	      cal.set(Calendar.MINUTE, 0);
	      cal.set(Calendar.SECOND, 0);
	      System.out.println("\n"+cal.getTime()+"\n");

	}

}
