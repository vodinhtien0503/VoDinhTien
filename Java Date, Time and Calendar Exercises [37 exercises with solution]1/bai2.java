package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;

//Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar.
public class bai2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	       // Get and display information of current date from the calendar:
		    System.out.println();
	        System.out.println("Nam: " + cal.get(Calendar.YEAR));
	        System.out.println("Thang: " + cal.get(Calendar.MONTH));
	        System.out.println("Ngay: " + cal.get(Calendar.DATE));
	        System.out.println("Gio: " + cal.get(Calendar.HOUR));
	        System.out.println("Phut: " + cal.get(Calendar.MINUTE));
		    System.out.println();

	}

}
