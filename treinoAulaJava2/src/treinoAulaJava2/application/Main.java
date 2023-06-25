package treinoAulaJava2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("10/04/2021");

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for(int i = 1 ; i<= 12;i++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela de número : " + i +" Vencimento é em : " + 
			    new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}
