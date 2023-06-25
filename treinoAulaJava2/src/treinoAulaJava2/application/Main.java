package treinoAulaJava2.application;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) throws ParseException, InterruptedException {

	LocalDate dataAntiga = LocalDate.of(2020,2,7);
		
	LocalDate dataNova = LocalDate.of(2023,5,17);
	
	 System.out.println("Data antiga é depois da data nova : "+ dataAntiga.isAfter(dataNova));
	 System.out.println("Data antiga é antes da data nova : "+ dataAntiga.isBefore(dataNova));
	 System.out.println("as Datas são iguais  : "+ dataAntiga.isEqual(dataNova));
	 Period periodo = Period.between(dataAntiga, dataNova);
	 
	 System.out.println("Periodo entre as datas em meses : " + periodo.getMonths());
	 System.out.println("Periodo entre as datas em dias : " + periodo.getDays());
	 System.out.println("Periodo entre as datas em anos : " + periodo.getYears());
	 
	 System.out.println("periodo total : " + periodo.getYears()+" Anos "+
						periodo.getMonths()+" Meses " + periodo.getDays()+" Dias");



	}

}
