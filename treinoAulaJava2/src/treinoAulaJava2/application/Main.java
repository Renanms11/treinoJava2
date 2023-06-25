package treinoAulaJava2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		

		long duração = ChronoUnit.DAYS.between( LocalDate.parse("2023-02-01"),LocalDate.now());
		System.out.println("Passuí " + duração +" dias entre as duas datas ");
		
	}

}
