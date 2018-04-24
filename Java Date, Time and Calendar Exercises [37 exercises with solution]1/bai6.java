package Java_Date_Time_and_Calendar_Exercises_37_exercises_with_solution;

import java.util.Calendar;

//Write a Java program to get current full date and time
public class bai6 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int ngay = cal.get(Calendar.DATE);
		int thang = cal.get(Calendar.MONTH)+1;
		int nam = cal.get(Calendar.YEAR);
		int gio = cal.get(Calendar.HOUR_OF_DAY);
		int phut = cal.get(Calendar.MINUTE);
		int giay = cal.get(Calendar.SECOND);
		System.out.println("hien tai: "+ngay+"-"+thang+"-"+nam+"  "+gio+":"+phut+":"+giay);
		

	}

}
