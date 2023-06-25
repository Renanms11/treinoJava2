package treinoAulaJava2.application;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) throws ParseException, InterruptedException {

		LocalDate dataBase = LocalDate.parse("2019-10-11");
		for (int i = 1; i <= 12; i++) {
			dataBase=dataBase.plus(1,ChronoUnit.MONTHS);
			System.out.println("Data de vencimento do Boleto : " 
							+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ " dos mês " +i);

		}

	}

}
