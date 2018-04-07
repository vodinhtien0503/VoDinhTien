package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;
	//. Write a Java program to get the last day of the current month
import java.util.Calendar;

public class bai7 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH));

	}

}
