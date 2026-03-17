package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(10);
		System.out.println(today);
		System.out.println(futureDate);
		// WHy?: Business Rule Validation
		if(futureDate.isAfter(today)) {
			System.out.println("Future Date is valid");
		}
		
		//calculate difference between dates
		Period period= Period.between(today, futureDate);
		System.out.println("Days between dates: "+ period.getDays());
		
		//WHAT: Date-Time for logs and auditing
		LocalDateTime currTimeStamp = LocalDateTime.now();
		
		//How: Formatting for UI/reports
		DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Formatted date: "+ today.format(dateFormatter));
		System.out.println("Formatted date time : "+ currTimeStamp.format(dateTimeFormatter));
		
	}

}
