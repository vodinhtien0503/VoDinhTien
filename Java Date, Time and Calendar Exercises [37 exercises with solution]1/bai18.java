package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;
//Write a Java program to check a year is a leap year or not.
public class bai18 {

	public static void main(String[] args) {
		 int year = 2018;
	       System.out.println();        
	       if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
	               System.out.println("Nam " + year + " la nam nhuan");
	       else
	               System.out.println("Nam " + year + " khong phai la nam nhuan");
	               System.out.println();

	}

}
