
package com.alejandro.java8.dateapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;


public class DateAPI {
	
	private static final String FORMAT_SHORT = "dd/MM/yyyy";
	private static final String FORMAT_LONG = "dd/MM/yyyy HH:mm:ss a";
	private static final Logger LOG = Logger.getLogger(DateAPI.class);
	
	public void verifiy(int version) {
		if(version == 7) {
			Calendar date1 = Calendar.getInstance();
			Calendar date2= Calendar.getInstance();
			date1.set(1995, 7,25);
			LOG.info(date1.after(date2));
		} else if(version == 8) {
			LocalDate date1 = LocalDate.of(1995, 8, 25);
			LocalDate date2 = LocalDate.now();
			LOG.info(date1.isAfter(date2));
			LocalTime time1 = LocalTime.of(22, 8, 25);
			LocalTime time2 = LocalTime.now();
			LOG.info(time1.isBefore(time2));
			LocalDateTime dateTime1 = LocalDateTime.of(1995, 8, 25,22,8,25);
			LocalDateTime dateTime2 = LocalDateTime.now();
			LOG.info(dateTime1.isEqual(dateTime2));
		}
	}
	
	public void measureTime(int version) {
		if(version == 7) {
			try {
				Long init = System.currentTimeMillis();
				Thread.sleep(2000);
				Long end = System.currentTimeMillis();
				LOG.info(end - init);
			} catch (InterruptedException e) {
				LOG.error(e.getMessage());
			}
		} else if ( version == 8) {
			try {
				Instant init = Instant.now();
				Thread.sleep(2000);
				Instant end = Instant.now();
				LOG.info(Duration.between(init, end).toMillis());
			} catch (InterruptedException e) {
				LOG.error(e.getMessage());
			}
		}
	}
	
	public void timeBetweenDates(int version) {
		if(version == 7) {
			Calendar born = Calendar.getInstance();
			Calendar actualy = Calendar.getInstance();
			born.set(1995, 8, 25);
			actualy.set(2019, 7, 10);
			int years = 0;
			
			while (born.before(actualy)) {
				born.add(Calendar.YEAR, 1);
				if(born.before(actualy)) {
					years++;
				}
			}
			
			LOG.info(years );
			
		} else if(version == 8) {
			LocalDate born = LocalDate.of(1995, 8, 25);
			LocalDate actualy = LocalDate.now();
			Period period = Period.between(born, actualy);
			LOG.info("Years: " + period.getYears());
			LOG.info("Months: " +  period.getMonths());
			LOG.info("Days: " +  period.getDays());
		}
	}
	
	public void convert(int version) {
		if(version == 7) {
			try {
				String dateString = "25/08/1995";
				DateFormat format = new SimpleDateFormat(FORMAT_SHORT);
				Date date = format.parse(dateString);
				LOG.info(date.toString());
				
				Date dateActualy = Calendar.getInstance().getTime();
				format = new SimpleDateFormat(FORMAT_LONG);
				String dateString2 = format.format(dateActualy);
				LOG.info(dateString2);
			} catch (ParseException e) {
				LOG.error(e.getMessage());
			}

		} else if(version == 8) {
			String dateString = "25/08/1995";
			DateTimeFormatter format = DateTimeFormatter.ofPattern(FORMAT_SHORT);
			LocalDate localDate = LocalDate.parse(dateString, format);
			LOG.info(localDate.toString());
			
			DateTimeFormatter format2 = DateTimeFormatter.ofPattern(FORMAT_LONG);
			LOG.info(format2.format(localDate));
		}
	}
}
