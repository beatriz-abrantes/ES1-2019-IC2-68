package softeng;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.table.DefaultTableModel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AvQualidade extends ES {

	private int DCI;
	private int DII;
	private int ADCI;
	private int ADII;

	private XSSFCell is_long_method;
	private FileInputStream excelfis = null; 
	private BufferedInputStream excelbis = null; 
	private XSSFWorkbook excelJPanelImport = null;




	public AvQualidade() {
		DCI = 0;
		DII = 0;
		ADCI = 0;
		ADII = 0;
	} 

		public void iPlasma (File excel) throws IOException {
	
			excelfis = new FileInputStream(excel);
			excelbis = new BufferedInputStream(excelfis);
			excelJPanelImport = new XSSFWorkbook(excelbis);
			XSSFSheet sheet = excelJPanelImport.getSheetAt(0);
			for (int linha = 0; linha < sheet.getLastRowNum(); linha++) {
				XSSFRow excellinha = sheet.getRow(linha);
				XSSFCell exceliPlasma = excellinha.getCell(9);
				String w= exceliPlasma.toString();
				XSSFCell excelcell_longmeth = excellinha.getCell(8);
				String s= excelcell_longmeth.toString();
				//getStringCellValue()
//				System.out.println("S:"+s);
//				System.out.println("W:"+w);
				if (s.equals("TRUE") && w.equals("TRUE")) {
					System.out.println();
					DII++;
				}
				if (s.equals("TRUE") && w.equals("FALSE")) {
					System.out.println();
					ADCI++;
				}
				if (s.equals("FALSE") && w.equals("FALSE")) {
					System.out.println();
					ADII++;
				}
				if (s.equals("FALSE") && w.equals("TRUE")) {
					System.out.println();
					DCI++;
				}
			}
			System.out.println("DCI:"+DCI);
	
		}





//	public void is_long_method( DefaultTableModel model )  {
//		for(int linha = 0 ; linha < model.getRowCount(); linha++) {
//			
//			if (a == "TRUE" && b == "TRUE") {
//				System.out.println("ola");
//			}
//			System.out.println("adeus");
//			
//		}
//
//
//
//
//
//	}





	public static void main(String[] args) {

	}

}
