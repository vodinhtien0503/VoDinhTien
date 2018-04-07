package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;
//Write a Java program to calculate your age
import java.time.LocalDate;
import java.time.Period;

public class bai32 {

	public static void main(String[] args) {
		
        LocalDate pdate = LocalDate.of(1998, 11, 21);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
 
     System.out.printf("toi %d tuoi, %d thang and %d ngay.\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());

	}

}
