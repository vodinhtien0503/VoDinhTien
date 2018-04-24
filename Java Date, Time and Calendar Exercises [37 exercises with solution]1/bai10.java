package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.YearMonth;

//Write a Java program to get the name of the first and last day of a month
public class bai10 {

	public static void main(String[] args) {
		YearMonth ym = YearMonth.of(2018, 4);
		String firstDay = ym.atDay(1).getDayOfWeek().name();
		String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println(firstDay);
		System.out.println(lastDay);

	}

}
