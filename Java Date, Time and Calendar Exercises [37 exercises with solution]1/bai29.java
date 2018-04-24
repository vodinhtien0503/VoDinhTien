package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Write a Java program to convert a string to date
public class bai29 {

	public static void main(String[] args) {
		String string = "April 4, 2018";
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		   LocalDate date = LocalDate.parse(string, formatter);
		   System.out.println();
		   System.out.println(date);
		   System.out.println();

	}

}
