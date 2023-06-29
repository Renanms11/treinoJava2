package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\arquivo_excel.xls");
		
	
		
		/*fileinputStream recebe dados de algum lugar / teclado ,arquivo,net*/
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);/*prepara a entrada do arquivi  excel xls*/
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/*pegando a planilha*/

		Iterator<Row> linhaInterator = planilha.iterator();/*cria um iterator para receber a planilha */
		
		while(linhaInterator.hasNext()){/*enquanto tiver linha */
			Row linha = linhaInterator.next();/*dados da linha(pessoa)*/
			
			int numeroCell =linha.getPhysicalNumberOfCells();/*pega no numero de celulas por linha*/
			Cell cell= linha.createCell(numeroCell);/*cria nova celula na linha*/
			cell.setCellValue("5.487,51");
		}
		entrada.close();
		
		
		/*FileOutputStream saida de dados /grava em alguma lugar : console,arquivo ,painel   */
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Mundaças feitas");
	}

}
