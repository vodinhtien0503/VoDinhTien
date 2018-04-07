package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Write a Java program to display the dates in the following formats.
	//Sample format :
	//Default format of LocalDate=2016-09-16                                                                        
	//16::Sep::2016                                                                                                 
	//Default format of LocalDateTime=2016-09-16T11:46:01.455                                                       
	//16::Sep::2016 11::46::01                                                                                      
	//Default format of Instant=2016-09-16T06:16:01.456Z                                                            
	//Default format after parsing = 2014-04-27T21:39:48
public class bai24 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
	
		System.out.println("\nDefault format of LocalDate="+date);
	
		System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Default format of LocalDateTime="+dateTime);
		
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
   		Instant timestamp = Instant.now();
		
		System.out.println("Default format of Instant="+timestamp);
		
	
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		System.out.println("Default format after parsing = "+dt+"\n");

	}

}
