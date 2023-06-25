package treinoAulaJava2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

	DateTimeFormatter dtf  =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate ld = LocalDate.parse("25/06/2023",dtf);
		
	System.out.println("Data atual : "+ld.format(dtf));
	System.out.println("Dia da semana : "+ld.getDayOfMonth());
	System.out.println("Ano : "+ld.getYear());
	System.out.println("menos 10 anos : "+ld.minusYears(10));


	
	}

}
