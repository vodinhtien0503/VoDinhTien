package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;
//Write a Java program to get the current time in all the available time zones.
import java.time.LocalDateTime;
import java.time.ZoneId;

public class bai21 {

	public static void main(String[] args) {
		ZoneId.SHORT_IDS.keySet().
	    stream().forEach( 
	    zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );

	}

}
