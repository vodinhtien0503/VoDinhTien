package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.LocalTime;

//Write a Java program to get the information of a given time.
public class bai27 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(12, 24, 32);  
	      int hour = time.getHour(); 
	      int minute = time.getMinute();  
	      int second = time.getSecond(); 
	      System.out.println("\nCurrent Local time: " + time);
	      System.out.println("Hour: " + hour);
	      System.out.println("Minue: " + minute); 
	      System.out.println("Second: " +second+"\n"); 

	}

}
