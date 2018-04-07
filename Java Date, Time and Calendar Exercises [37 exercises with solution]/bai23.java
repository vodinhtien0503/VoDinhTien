package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

//Write a Java program to get the months remaining in the year
public class bai23 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 
	     LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
	     Period period = today.until(lastDayOfYear);
	     System.out.println();
	     System.out.println("Months remaining in the year: "+period.getMonths());	
	     System.out.println();

	}

}
