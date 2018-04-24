package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;
//Write a Java program to find seconds since 1970.
public class bai37 {

	public static void main(String[] args) {
		long seconds = System.currentTimeMillis() / 1000l;
	     System.out.println("\nSeconds since 1970: "+seconds+"\n");
	}

}
