package com.spike;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		String ss="2022-09-21T08:57:44.000Z";
System.out.println(convertDate(ss));
	}
	private static LocalDate convertDate(String date) throws ParseException {

SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date parsedDate = inputFormat.parse(date);
		String formattedDate = outputFormat.format(parsedDate);
		System.out.println(formattedDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
		LocalDate localDate = LocalDate.parse(formattedDate, formatter);
		System.out.println(localDate);
		return localDate;
	}
}
