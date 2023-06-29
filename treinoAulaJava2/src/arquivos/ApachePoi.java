package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\arquivo_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();	
		}
		
		Pessoa pessoa1 = new Pessoa("Renan Miranda Sena", 34, "renanSena2015@gmail.com");
		Pessoa pessoa2 = new Pessoa("Katianny Maia Oliveira Miranda", 27, "Katymaia@gmail.com");
		Pessoa pessoa3 = new Pessoa("Francisco de Assis Queiroz de Sena", 65, "faqSena@gmail.com");
		Pessoa pessoa4 = new Pessoa("Francimar Mirana De Moraes Sena", 78, "cimarMiranda@gmail.com");
		Pessoa pessoa5 = new Pessoa("Kamila Miranda Sena", 36, "kamilaSena@gmail.com");

		List<Pessoa> listaP = new ArrayList<>();
		
		listaP.add(pessoa1);
		listaP.add(pessoa2);
		listaP.add(pessoa3);
		listaP.add(pessoa4);
		listaP.add(pessoa5);

		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();/*vai ser usado para escrever na planilha*/
		HSSFSheet  linhaPessoa = hssfWorkbook.createSheet("Criando planilha");/*vai criar a planilha */
		
		
		int numeroLinha = 0 ;
		
		for (Pessoa p : listaP) {
		   Row linha = linhaPessoa.createRow(numeroLinha++); /*Criando uma linha na planilha*/
		   int cell = 0;
		   
		   Cell cellNome= linha.createCell(cell++);
		   cellNome.setCellValue(p.getNome());
		   
		 
		   
		   Cell cellIdade= linha.createCell(cell++);
		   cellIdade.setCellValue(p.getIdade());
		  
		   Cell cellEmail= linha.createCell(cell++);
		   cellEmail.setCellValue(p.getEmail());
		   
		if(p.getNome().equals("Renan Miranda Sena")) {
			  Cell cellE= linha.createCell(cell++);
			   cellE.setCellValue("Você é baranga");
		}else {
			  Cell cellE= linha.createCell(cell++);
			   cellE.setCellValue("Você é genial");
		}
		
			
		}
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);/*Escreve no arquivo*/
		
		saida.flush();
		saida.close();
		
		
		System.out.println("Planilha criada !!");
				
	}

}
