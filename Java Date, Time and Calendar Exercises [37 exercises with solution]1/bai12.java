package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.text.DateFormatSymbols;
import java.util.Locale;

//Write a Java program to get localized day-in-week name.
public class bai12 {

	public static void main(String[] args) {
		DateFormatSymbols symmbols = new DateFormatSymbols(new Locale("en"));
		String[] dayNames = symmbols.getWeekdays();
		for(String s:dayNames) {
			System.out.println(s+"\n");
		}

	}

}
