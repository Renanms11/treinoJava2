package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerAquivoTxt {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				new File("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\arquivo.csv"));

		Scanner lerArquivo = new Scanner(fis, "UTF-8");
		List<Pessoa> listaP = new ArrayList<>();

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			if (!linha.equals(null) && !linha.isEmpty()) {
				String[] list = linha.split(";");
				Pessoa pessoa = new Pessoa(list[0], Integer.parseInt(list[1]), list[2]);

				listaP.add(pessoa);
			}

		}

		for (Pessoa pessoa : listaP) {
			System.out.println(pessoa);
		}

	}

}
