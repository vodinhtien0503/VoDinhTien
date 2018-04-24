package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

//. Write a Java program to get year and months between two dates.
public class bai19 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();    
	     LocalDate userday = LocalDate.of(2015, Month.MAY, 15); 
	     Period diff = Period.between(userday, today); 
	     System.out.println("Chenh lech "+ userday +" va "+ today +": " 
	     + diff.getYears() +" Nam(s) va "+ diff.getMonths() +" Thang()s");

	}

}
