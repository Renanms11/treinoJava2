package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String args[]) throws IOException {

		Pessoa pessoa1 = new Pessoa("Renan Miranda Sena", 34, "renanSena2015@gmail.com");
		Pessoa pessoa2 = new Pessoa("Katianny Maia Oliveira Miranda", 27, "Katymaia@gmail.com");
		Pessoa pessoa3 = new Pessoa("Francisco de Assis Queiroz de Sena", 65, "faqSena@gmail.com");
		List<Pessoa> listaP = new ArrayList<>();
		
		listaP.add(pessoa1);
		listaP.add(pessoa2);
		listaP.add(pessoa3);


		File arquivo = new File("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\arquivo.txt");

		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		FileWriter fw = new FileWriter(arquivo);
		
		for(Pessoa p : listaP) {
			fw.write(p.getNome()+";"+ p.getIdade()+";"+ p.getEmail()+ "\n");
		}
		
		fw.flush();
		fw.close();
		
		System.out.println("Feito !!!!! ");
		

	}

}
