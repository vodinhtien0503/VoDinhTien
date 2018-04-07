package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.LocalTime;

//Write a Java program to add some hours to the current time.
public class bai15 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(3);
		System.out.println("Them 3 tieng vao hien tai: "+newTime);

	}

}
