package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;

//Write a Java program to get the number of days of a month
public class bai11 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int thang = cal.get(Calendar.MONTH)+1;
		int dayofmonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("so ngay trong thang "+thang+" la: "+dayofmonth);

	}

}
