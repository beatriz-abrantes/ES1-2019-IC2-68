package softeng;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AvQualidade extends ES {

	private int DCI1;
	private int DII1;
	private int ADCI1;
	private int ADII1;

	private int DCI2;
	private int DII2;
	private int ADCI2;
	private int ADII2;

	private int DCI;
	private int DII;
	private int ADCI;
	private int ADII;


	private int DCI3;
	private int DII3;
	private int ADCI3;
	private int ADII3;

	private XSSFCell is_long_method;
	private FileInputStream excelfis = null; 
	private BufferedInputStream excelbis = null; 
	private XSSFWorkbook excelJPanelImport = null;
	private JFrame janelaiPlasma; 
	private List<Registo> todos;
	private List<Registo> MWE;

	public AvQualidade() {

		

		DCI1 = 0;
		DII1 = 0;
		ADCI1 = 0;
		ADII1 = 0;

		DCI2 = 0;
		DII2 = 0;
		ADCI2 = 0;
		ADII2= 0;

		DCI = 0;
		DII = 0;
		ADCI = 0;
		ADII = 0;

		DCI3 = 0;
		DII3 = 0;
		ADCI3 = 0;
		ADII3 = 0;
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

			if (s.equals("TRUE") && w.equals("TRUE")) {
				System.out.println();
				DCI1++;
			}
			if (w.equals("TRUE") && s.equals("FALSE")) {
				System.out.println();
				DII1++;
			}
			if (w.equals("FALSE") && s.equals("FALSE")) {
				System.out.println();
				ADCI1++;
			}
			if (w.equals("FALSE") && s.equals("TRUE")) {
				System.out.println();
				ADII1++;
			}
		}
		JOptionPane.showMessageDialog(null, "DCI: " + DCI1 + "\n" +  "DII: " + DII1 + "\n" + "ADCI: " + ADCI1 + "\n" + "ADII: " + ADII1);
		System.out.println("DCI: "+DCI1);
		System.out.println("DII: "+DII1);
		System.out.println("ADCI: "+ADCI1);
		System.out.println("ADII :"+ADII1);


	}

	public void PMD (File excel) throws IOException {

		excelfis = new FileInputStream(excel);
		excelbis = new BufferedInputStream(excelfis);
		excelJPanelImport = new XSSFWorkbook(excelbis);
		XSSFSheet sheet = excelJPanelImport.getSheetAt(0);
		for (int linha = 0; linha < sheet.getLastRowNum(); linha++) {
			XSSFRow excellinha = sheet.getRow(linha);
			XSSFCell excelPMD = excellinha.getCell(10);
			String w= excelPMD.toString();
			XSSFCell excelcell_longmeth = excellinha.getCell(8);
			String s= excelcell_longmeth.toString();

			if (s.equals("TRUE") && w.equals("TRUE")) {
				System.out.println();
				DCI2++;
			}
			if (w.equals("TRUE") && s.equals("FALSE")) {
				System.out.println();
				DII2++;
			}
			if (w.equals("FALSE") && s.equals("FALSE")) {
				System.out.println();
				ADCI2++;
			}
			if (w.equals("FALSE") && s.equals("TRUE")) {
				System.out.println();
				ADII2++;
			}
		}

		JOptionPane.showMessageDialog(null, "DCI: " + DCI2 + "\n" +  "DII: " + DII2 + "\n" + "ADCI: " + ADCI2 + "\n" + "ADII: " + ADII2);
		System.out.println("DCI: "+DCI2);
		System.out.println("DII: "+DII2);
		System.out.println("ADCI: "+ADCI2);
		System.out.println("ADII:"+ADII2);

	}
	public void AvRegras (File excel) throws IOException {

		excelfis = new FileInputStream(excel);
		excelbis = new BufferedInputStream(excelfis);
		excelJPanelImport = new XSSFWorkbook(excelbis);
		XSSFSheet sheet = excelJPanelImport.getSheetAt(0);

		for (int linha = 0; linha < sheet.getLastRowNum(); linha++) {

			System.out.println(todos);
			XSSFRow excellinha = sheet.getRow(linha);
			XSSFCell excelcell_longmeth = excellinha.getCell(8);
			String s= excelcell_longmeth.toString();
			
			
			
			for(Registo r : getMethodsWithError()) {

				System.out.println("AQUI");



				if (r.isBool()==true && s.equals("TRUE")) {
					System.out.println("qui ta");
					DCI++;
				}

				if (r.isBool()==true && s.equals("FALSE")) {
					System.out.println("qui tamos");
					DII++;
				}

				if (r.isBool()==false && s.equals("TRUE")) {
					System.out.println("qui tamos nos");
					ADCI++;
				}
				if (r.isBool()==false && s.equals("FALSE")) {
					System.out.println("qui tamos nos todos");
					ADII++;
				}
			}

			for(Registo reg : getMethodsWithError1()) {



				if (reg.isBool() == s.equals("TRUE")) {
					System.out.println("qui ta");
					DCI3++;
				}

				if (reg.isBool()==true && s.equals("FALSE")) {
					System.out.println("qui tamos");
					DII3++;
				}

				if (reg.isBool()==false && s.equals("TRUE")) {
					System.out.println("qui tamos nos");
					ADCI3++;
				}
				if (!(reg.isBool()) == s.equals("FALSE")) {
					System.out.println("qui tamos nos todos");
					ADII3++;
				}


			}

		}
		//JOptionPane.showMessageDialog(null, "DCI: " + DCI + "\n" +  "DII: " + DII + "\n" + "ADCI: " + ADCI + "\n" + "ADII: " + ADII);
		System.out.println("DCI: "+DCI);
		System.out.println("DII: "+DII);
		System.out.println("ADCI: "+ADCI);
		System.out.println("ADII :"+ADII);
		System.out.println("DCI: "+DCI3);
		System.out.println("DII: "+DII3);
		System.out.println("ADCI: "+ADCI3);
		System.out.println("ADII :"+ADII3);

	}
	public static void main(String[] args) {

	}


}
