package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;
import java.util.Date;

//Write a Java program to get a date after 2 weeks.
public class bai16 {

	public static void main(String[] args) {
		int noOfDays = 14;
		Calendar cal = Calendar.getInstance();
		Date cDate = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date date = cal.getTime();
		System.out.println("Hien tai: "+cDate);
		System.out.println("sau 2 tuan: "+date);

	}

}
