package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;

//Write a Java program to create a Date object using the Calendar class. 
public class bai1 {

	public static void main(String[] args) {
		int year = 2018;
		int month = 3; //April
		int date = 6;
		
		Calendar cal = Calendar.getInstance();
		cal.clear();
		System.out.println();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);
		
		System.out.println(cal.getTime());
		System.out.println();
	}

}
