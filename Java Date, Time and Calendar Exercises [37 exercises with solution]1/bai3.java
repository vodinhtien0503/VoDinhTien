package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;

//Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar
public class bai3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("Thoi gian hien tai: "+cal.getTime());
		int Maxyear = cal.getActualMaximum(Calendar.YEAR);
		int Maxmonth = cal.getActualMaximum(Calendar.MONTH);
		int Maxweek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int Maxdate = cal.getActualMaximum(Calendar.DATE);
		System.out.println("Max Nam: "+Maxyear);
		System.out.println("Max Thang: "+Maxmonth);
		System.out.println("Max Tuan: "+Maxweek);
		System.out.println("Max Ngay: "+Maxdate);
	}

}
