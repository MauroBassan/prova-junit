package it.corso.java.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import sun.util.resources.LocaleData;

public class TestDate {

	public static void main(String[] args) {
		TestDate test = new TestDate();
		test.esempioDate();
		
		test.esCalendar();
		
		test.esLocalDate();
		
		test.esLocalTime();
		
		test.esPeriodDuration();
		
		test.simpleDateFormat();
		
	}
	
	private void simpleDateFormat() {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.YEAR, 24);
		c.set(Calendar.HOUR, 15);
		c.set(Calendar.MINUTE, 15);
		c.set(Calendar.SECOND, 15);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String data = sdf.format(c.getTime());
		System.out.println(data);
		
		try {
			Date d = sdf.parse("01/01/2020");
			System.out.println(d.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	private void esPeriodDuration() {
		Duration d1 = Duration.ofSeconds(10, 40);
		
		System.out.println(d1.getSeconds());
		System.out.println(d1.getNano());
		
		Duration d2 = Duration.between(LocalTime.of(9, 30), LocalTime.of(19, 30));
		System.out.println(d2.getSeconds()/3600);
		System.out.println(d2.getNano());
	}

	private void esLocalTime() {
		List<LocalTime> orari = new ArrayList<LocalTime>();
		
		orari.add(LocalTime.of(9, 30));
		orari.add(LocalTime.of(13, 00));
		orari.add(LocalTime.of(14, 30));
		orari.add(LocalTime.of(19, 30));
		
		System.out.println("orari di apertura: ");
		for (LocalTime l : orari) {
			System.out.println(l);
		}
		
		/*LocalTime lt = LocalTime.of(9, 30);
		 * 
		 *System.out.println(lt.toString());*/
	}
	
	private void esempioDate() {
		Date data = new Date();
		// getTime riporta data e l'ora in formato timestamp
		System.out.println(data.getTime());
		System.out.println(data.toString());
	}
	
	private void esCalendar() {
		Calendar cal = Calendar.getInstance();
		
		/* setTime prende in ingresso un oggetto di tipo Date, 
		 * quindi farò.. (new Date())
		 */
		cal.setTime(new Date());
		
		cal.set(Calendar.YEAR, 2020);	
		cal.set(Calendar.MONTH, 10);	// i mesi partono dallo 0
		cal.set(Calendar.DATE, 11);
		
		System.out.println(cal.getTime());
	}
	
	private void esLocalDate() {
		LocalDate ld = LocalDate.of(2020, 3, 24);
		
		System.out.println(ld.isLeapYear());
		System.out.println(ld.lengthOfMonth());
		System.out.println(ld.getDayOfWeek());	
		
	}
}
