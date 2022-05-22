package practice_project;

import java.util.*;
import java.util.spi.CalendarDataProvider;

public class DateAndTime {

	public static void main(String[] args) {
		Calendar obj = Calendar.getInstance();
		// Date or Time 
		System.out.println("Date: " + obj.get(Calendar.DATE));
		System.out.println("Month: " +  obj.get(Calendar.MONTH));
		System.out.println("Year: " +  obj.get(Calendar.YEAR));
		System.out.print("Current Time is :");
		System.out.print( obj.get(Calendar.HOUR) +":");
		System.out.print( obj.get(Calendar.MINUTE)+":");
		System.out.println( obj.get(Calendar.SECOND));

	}

}
