package treinoAulaJava2.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// formato para banco de dados
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		System.out.println("Data em milisegundos " + date.getTime());

		System.out.println("Dia do mês : " + date.getDate());
		System.out.println("Dia da semana : " + date.getDay());
		System.out.println("Ano : " + (date.getYear() + 1900));
		System.out.println("Mês : " + (date.getMonth() + 1));
		System.out.println("Time zone / Zona de tempo :" + date.getTimezoneOffset());
		System.out.println("Horas do dia  : " + date.getHours());
		System.out.println("Minutos : " + date.getMinutes());

		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));

		String data = "24/10/1988 10:30:10";

		Date date2 = sdf.parse(data);
		System.out.println(date2);

		System.out.println("\n******************Calendar******************");
		System.out.println("Tempo : " + calendar.getTime());
		System.out.println("Ano : " + calendar.get(Calendar.YEAR));
		System.out.println("Dia do mês : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês do ano : " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("Calendar  formatado :"+sdf.format(calendar.getTime()));

		System.out.println("acabou");
	}

}
