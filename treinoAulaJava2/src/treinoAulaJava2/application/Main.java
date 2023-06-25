package treinoAulaJava2.application;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws ParseException, InterruptedException {

		Instant instInicial = Instant.now();

		Thread.sleep(2000);/*pode ser usado para ver a duração de um processo qualquer que nao conhecemos*/

		Instant instFinal = Instant.now();

		
		Duration dur = Duration.between(instInicial, instFinal);
		
		System.out.println("Duração entre nano segundos :"+dur.toNanos());
		System.out.println("Duração em horas : " +dur.toHours());
		System.out.println("Duração em mili segundos"+dur.toMillis());
		System.out.println("Duração em minutos : "+dur.toMinutes());
		

	}

}
