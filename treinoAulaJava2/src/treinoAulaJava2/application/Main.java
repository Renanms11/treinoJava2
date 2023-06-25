package treinoAulaJava2.application;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) throws ParseException, InterruptedException {

		LocalDate dataBase = LocalDate.parse("2019-10-11");

		System.out.println("Mais 5 dias : " + ( dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 5 anos : " + ( dataBase = dataBase.plusYears(5)));
		System.out.println("Mais 4 semanas : " + ( dataBase = dataBase.plusWeeks(4)));
		System.out.println("Mais 2 meses : " + ( dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 ano : " + ( dataBase = dataBase.minusYears(1)));

		System.out.println("Menos 1 mes : " + ( dataBase = dataBase.minusMonths(1)));
		System.out.println("Menos 2 dias : " + ( dataBase = dataBase.minusDays(2)));
		System.out.println("Menos 3 semanas : " + ( dataBase = dataBase.minusWeeks(3)));


	}

}
