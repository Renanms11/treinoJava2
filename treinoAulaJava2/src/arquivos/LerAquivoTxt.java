package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LerAquivoTxt {

	public static void main(String[] args) throws IOException {
		
	FileInputStream fis = new FileInputStream(new File("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\arquivo.txt"));
	
	Scanner lerArquivo = new Scanner(fis,"UTF-8");
	
	while(lerArquivo.hasNext()) {
		
		String linha = lerArquivo.nextLine();
		
		if(!linha.equals(null) && !linha.isEmpty()) {
			System.out.println(linha);

		}
		
		
		
		
	}
	
	
	
	
	
	}
	
}
