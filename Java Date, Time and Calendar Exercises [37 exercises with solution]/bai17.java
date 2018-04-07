package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;
//Write a Java program to get a date before and after 1 year compares to the current date
import java.util.Calendar;
import java.util.Date;

// Write a Java program to get a date before and after 1 year compares to the current date
public class bai17 {

	public static void main(String[] args) {
	    Calendar cal = Calendar.getInstance();
	      Date cdate = cal.getTime();
	      // get next year
	      cal.add(Calendar.YEAR, 1); 
	      Date nyear = cal.getTime();
	      //get previous year
	      cal.add(Calendar.YEAR, -2); 
	      Date pyear = cal.getTime();
	      System.out.println("\nCurrent Date : " + cdate);
	      System.out.println("\nDate before 1 year : " + pyear);
	      System.out.println("\nDate after 1 year  : " + nyear+"\n"); 

	}

}
