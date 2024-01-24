package dateTimeApiPrg;

import java.time.*;

public class DateTimeApiPrg {

	public static void main(String[] args) {
		// Date
		LocalDate date = LocalDate.now();
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println(date);
		System.out.println("DD/MM/YYYY format date : " + dd + " /" + mm + " /" + yyyy);
		// Time
		LocalTime time = LocalTime.now();
		int hr = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nanosecond = time.getNano();
		System.out.println(time);
		System.out.println("Hours: " + hr);
		System.out.println("Minutes :" + minute);
		System.out.println("Seconds :" + second);
		System.out.println("Nanosecond :" + nanosecond);

		// Date & Time
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		// perticular date & time
		LocalDateTime pdt = LocalDateTime.of(1990, 06, 25, 10, 30, 00, 00);
		System.out.println(pdt);

		// Period class
		LocalDate birthday = LocalDate.of(1990, 06, 25);
		Period p = Period.between(birthday, date);
		System.out.println("Year :" + p.getYears() + " Months :" + p.getMonths() + " Days : " + p.getDays());

		// Year class
		int year = 2025;
		Year y = Year.of(year);
		if (y.isLeap(year)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
		
		//ZoneId class
		ZoneId zone =ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId zone1 =ZoneId.of("America/Los_Angeles");
		System.out.println(zone1);
		ZonedDateTime zdt =ZonedDateTime.now(zone1);
		System.out.println(zdt);
		
		

	}

}
