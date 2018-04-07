package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.LocalDate;

//Write a Java program to get the dates 10 days before and after today.
public class bai22 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 
	     System.out.println("\nCurrent Date: "+today);
	     System.out.println("10 ngay truoc "+today.plusDays(-10));
	     System.out.println("10 ngay sau "+today.plusDays(10)+"\n");

	}

}
