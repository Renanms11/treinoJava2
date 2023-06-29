package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {

		FileInputStream lerDados = new FileInputStream(
				new File("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\arquivo_excel.xls"));

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(lerDados);/* prepara o arquivo excel para ler */
		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);/* Pega a primeira planilha do nosso arquivo excel */

		Iterator<Row> rowIterator = hssfSheet.iterator();

		List<Pessoa> listP = new ArrayList<>();

		while (rowIterator.hasNext()) {/* enquanto tiver linha do excel */
			Row linha = rowIterator.next();/* dados da pessoa na linha */
			Iterator<Cell> cellIterator = linha.iterator();

			Pessoa p = new Pessoa();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				
				switch (cell.getColumnIndex()) {
				case 0:
					p.setNome(cell.getStringCellValue());
					break;
				case 1:
					p.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				case 2:
					p.setEmail(cell.getStringCellValue());
					break;

				}

			}/*fim das celulas linhas */
			
			listP.add(p);

		}
		lerDados.close();/*Terminou de ler o arquivo tem que fechar*/
		
		for (Pessoa pessoa : listP) {
			System.out.println(pessoa);
		}

	}

}
