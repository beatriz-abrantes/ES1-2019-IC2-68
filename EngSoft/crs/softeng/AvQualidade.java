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

// TODO: Auto-generated Javadoc
/**
 * The Class AvQualidade.
 */
public class AvQualidade {

	/** The dci1. */
	private int DCI1;
	
	/** The dii1. */
	private int DII1;
	
	/** The adci1. */
	private int ADCI1;
	
	/** The adii1. */
	private int ADII1;

	/** The dci2. */
	private int DCI2;
	
	/** The dii2. */
	private int DII2;
	
	/** The adci2. */
	private int ADCI2;
	
	/** The adii2. */
	private int ADII2;

	/** The dci. */
	private int DCI;
	
	/** The dii. */
	private int DII;
	
	/** The adci. */
	private int ADCI;
	
	/** The adii. */
	private int ADII;


	/** The dci3. */
	private int DCI3;
	
	/** The dii3. */
	private int DII3;
	
	/** The adci3. */
	private int ADCI3;
	
	/** The adii3. */
	private int ADII3;

	/** The is long method. */
	private XSSFCell is_long_method;
	
	/** The excelfis. */
	private FileInputStream excelfis = null; 
	
	/** The excelbis. */
	private BufferedInputStream excelbis = null; 
	
	/** The excel J panel import. */
	private XSSFWorkbook excelJPanelImport = null;
	
	/** The janelai plasma. */
	private JFrame janelaiPlasma; 
	
	/** The todos. */
	private List<Registo> todos;
	
	/** The mwe. */
	private List<Registo> MWE;

	/**
	 * Instantiates a new av qualidade.
	 */
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

	/**
	 * I plasma.
	 *
	 * @param excel the excel
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
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

	/**
	 * Pmd.
	 *
	 * @param excel the excel
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
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
	
	/**
	 * Av regras.
	 *
	 * @param excel the excel
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void AvRegras (File excel) throws IOException {

		excelfis = new FileInputStream(excel);
		excelbis = new BufferedInputStream(excelfis);
		excelJPanelImport = new XSSFWorkbook(excelbis);
		XSSFSheet sheet = excelJPanelImport.getSheetAt(0);

		for (int linha = 0; linha < sheet.getLastRowNum(); linha++) {

			//System.out.println(todos);
			XSSFRow excellinha = sheet.getRow(linha);
			XSSFCell excelcell_longmeth = excellinha.getCell(8);
			String s= excelcell_longmeth.toString();
			
//			
//			System.out.println(getMethodsWithError());
//			System.out.println(getErros());
			
			for(Registo r : ES.getMethodsWithError()) {

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

			for(Registo reg : ES.getMethodsWithError1()) {
 


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
		JOptionPane.showMessageDialog(null, "DCI: " + DCI + " "+ DCI3 + "\n" +  "DII: " + DII  + " "+ DII3 +"\n" + "ADCI: " + ADCI + " " + DCI3 +"\n" + "ADII: " + ADII);
		
		System.out.println("DCI: "+DCI);
		System.out.println("DII: "+DII);
		System.out.println("ADCI: "+ADCI);
		System.out.println("ADII :"+ADII);
		System.out.println("DCI: "+DCI3);
		System.out.println("DII: "+DII3);
		System.out.println("ADCI: "+ADCI3);
		System.out.println("ADII :"+ADII3);

	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

	}

	/**
	 * Gets the dci1.
	 *
	 * @return the dci1
	 */
	public int getDCI1() {
		return DCI1;
	}

	/**
	 * Sets the dci1.
	 *
	 * @param dCI1 the new dci1
	 */
	public void setDCI1(int dCI1) {
		DCI1 = dCI1;
	}

	/**
	 * Gets the dii1.
	 *
	 * @return the dii1
	 */
	public int getDII1() {
		return DII1;
	}

	/**
	 * Sets the dii1.
	 *
	 * @param dII1 the new dii1
	 */
	public void setDII1(int dII1) {
		DII1 = dII1;
	}

	/**
	 * Gets the adci1.
	 *
	 * @return the adci1
	 */
	public int getADCI1() {
		return ADCI1;
	}

	/**
	 * Sets the adci1.
	 *
	 * @param aDCI1 the new adci1
	 */
	public void setADCI1(int aDCI1) {
		ADCI1 = aDCI1;
	}

	/**
	 * Gets the adii1.
	 *
	 * @return the adii1
	 */
	public int getADII1() {
		return ADII1;
	}

	/**
	 * Sets the adii1.
	 *
	 * @param aDII1 the new adii1
	 */
	public void setADII1(int aDII1) {
		ADII1 = aDII1;
	}

	/**
	 * Gets the dci2.
	 *
	 * @return the dci2
	 */
	public int getDCI2() {
		return DCI2;
	}

	/**
	 * Sets the dci2.
	 *
	 * @param dCI2 the new dci2
	 */
	public void setDCI2(int dCI2) {
		DCI2 = dCI2;
	}

	/**
	 * Gets the dii2.
	 *
	 * @return the dii2
	 */
	public int getDII2() {
		return DII2;
	}

	/**
	 * Sets the dii2.
	 *
	 * @param dII2 the new dii2
	 */
	public void setDII2(int dII2) {
		DII2 = dII2;
	}

	/**
	 * Gets the adci2.
	 *
	 * @return the adci2
	 */
	public int getADCI2() {
		return ADCI2;
	}

	/**
	 * Sets the adci2.
	 *
	 * @param aDCI2 the new adci2
	 */
	public void setADCI2(int aDCI2) {
		ADCI2 = aDCI2;
	}

	/**
	 * Gets the adii2.
	 *
	 * @return the adii2
	 */
	public int getADII2() {
		return ADII2;
	}

	/**
	 * Sets the adii2.
	 *
	 * @param aDII2 the new adii2
	 */
	public void setADII2(int aDII2) {
		ADII2 = aDII2;
	}

	/**
	 * Gets the dci.
	 *
	 * @return the dci
	 */
	public int getDCI() {
		return DCI;
	}

	/**
	 * Sets the dci.
	 *
	 * @param dCI the new dci
	 */
	public void setDCI(int dCI) {
		DCI = dCI;
	}

	/**
	 * Gets the dii.
	 *
	 * @return the dii
	 */
	public int getDII() {
		return DII;
	}

	/**
	 * Sets the dii.
	 *
	 * @param dII the new dii
	 */
	public void setDII(int dII) {
		DII = dII;
	}

	/**
	 * Gets the adci.
	 *
	 * @return the adci
	 */
	public int getADCI() {
		return ADCI;
	}

	/**
	 * Sets the adci.
	 *
	 * @param aDCI the new adci
	 */
	public void setADCI(int aDCI) {
		ADCI = aDCI;
	}

	/**
	 * Gets the adii.
	 *
	 * @return the adii
	 */
	public int getADII() {
		return ADII;
	}

	/**
	 * Sets the adii.
	 *
	 * @param aDII the new adii
	 */
	public void setADII(int aDII) {
		ADII = aDII;
	}

	/**
	 * Gets the dci3.
	 *
	 * @return the dci3
	 */
	public int getDCI3() {
		return DCI3;
	}

	/**
	 * Sets the dci3.
	 *
	 * @param dCI3 the new dci3
	 */
	public void setDCI3(int dCI3) {
		DCI3 = dCI3;
	}

	/**
	 * Gets the dii3.
	 *
	 * @return the dii3
	 */
	public int getDII3() {
		return DII3;
	}

	/**
	 * Sets the dii3.
	 *
	 * @param dII3 the new dii3
	 */
	public void setDII3(int dII3) {
		DII3 = dII3;
	}

	/**
	 * Gets the adci3.
	 *
	 * @return the adci3
	 */
	public int getADCI3() {
		return ADCI3;
	}

	/**
	 * Sets the adci3.
	 *
	 * @param aDCI3 the new adci3
	 */
	public void setADCI3(int aDCI3) {
		ADCI3 = aDCI3;
	}

	/**
	 * Gets the adii3.
	 *
	 * @return the adii3
	 */
	public int getADII3() {
		return ADII3;
	}

	/**
	 * Sets the adii3.
	 *
	 * @param aDII3 the new adii3
	 */
	public void setADII3(int aDII3) {
		ADII3 = aDII3;
	}

	/**
	 * Gets the checks if is long method.
	 *
	 * @return the checks if is long method
	 */
	public XSSFCell getIs_long_method() {
		return is_long_method;
	}

	/**
	 * Sets the checks if is long method.
	 *
	 * @param is_long_method the new checks if is long method
	 */
	public void setIs_long_method(XSSFCell is_long_method) {
		this.is_long_method = is_long_method;
	}

	/**
	 * Gets the excelfis.
	 *
	 * @return the excelfis
	 */
	public FileInputStream getExcelfis() {
		return excelfis;
	}

	/**
	 * Sets the excelfis.
	 *
	 * @param excelfis the new excelfis
	 */
	public void setExcelfis(FileInputStream excelfis) {
		this.excelfis = excelfis;
	}

	/**
	 * Gets the excelbis.
	 *
	 * @return the excelbis
	 */
	public BufferedInputStream getExcelbis() {
		return excelbis;
	}

	/**
	 * Sets the excelbis.
	 *
	 * @param excelbis the new excelbis
	 */
	public void setExcelbis(BufferedInputStream excelbis) {
		this.excelbis = excelbis;
	}

	/**
	 * Gets the excel J panel import.
	 *
	 * @return the excel J panel import
	 */
	public XSSFWorkbook getExcelJPanelImport() {
		return excelJPanelImport;
	}

	/**
	 * Sets the excel J panel import.
	 *
	 * @param excelJPanelImport the new excel J panel import
	 */
	public void setExcelJPanelImport(XSSFWorkbook excelJPanelImport) {
		this.excelJPanelImport = excelJPanelImport;
	}

	/**
	 * Gets the janelai plasma.
	 *
	 * @return the janelai plasma
	 */
	public JFrame getJanelaiPlasma() {
		return janelaiPlasma;
	}

	/**
	 * Sets the janelai plasma.
	 *
	 * @param janelaiPlasma the new janelai plasma
	 */
	public void setJanelaiPlasma(JFrame janelaiPlasma) {
		this.janelaiPlasma = janelaiPlasma;
	}

	/**
	 * Gets the todos.
	 *
	 * @return the todos
	 */
	public List<Registo> getTodos() {
		return todos;
	}

	/**
	 * Sets the todos.
	 *
	 * @param todos the new todos
	 */
	public void setTodos(List<Registo> todos) {
		this.todos = todos;
	}

	/**
	 * Gets the mwe.
	 *
	 * @return the mwe
	 */
	public List<Registo> getMWE() {
		return MWE;
	}

	/**
	 * Sets the mwe.
	 *
	 * @param mWE the new mwe
	 */
	public void setMWE(List<Registo> mWE) {
		MWE = mWE;
	}

	


}
