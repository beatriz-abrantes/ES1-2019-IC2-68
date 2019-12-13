package softeng;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegrasNovas extends ES{

	public void LocAndCycloErrorDetector( File excel, int a, int b, int d, double f) {

		FileInputStream excelfis;
		try {

			excelfis = new FileInputStream(excel);

			BufferedInputStream excelbis = new BufferedInputStream(excelfis);
			XSSFWorkbook excelJPanelImport = new XSSFWorkbook(excelbis);
			XSSFSheet sheet = excelJPanelImport.getSheetAt(0);

			for (int linha = 1; linha < sheet.getLastRowNum(); linha++) {

				XSSFRow excellinha = sheet.getRow(linha);

				XSSFCell excelLOC = excellinha.getCell(4);
				String LOC = excelLOC.toString();

				XSSFCell excelCYCLO = excellinha.getCell(5);
				String CYCLO = excelCYCLO.toString();

				XSSFCell excelATFD = excellinha.getCell(6);
				String ATFD = excelATFD.toString();

				XSSFCell excelLAA = excellinha.getCell(7);
				String LAA = excelLAA.toString();

				XSSFCell excelMethodNr = excellinha.getCell(0);
				int c = (int) excelMethodNr.getNumericCellValue();
				

				String s = excellinha.getCell(7).getCellType().toString();

				double laa;
				if(s.contentEquals("NUMERIC")) {
					laa = excellinha.getCell(7).getNumericCellValue();
				}
				else
					laa = Double.parseDouble(excellinha.getCell(7).getStringCellValue());


				if(LOC!="LOC" && CYCLO!="CYCLO" && ATFD!="ATFD" && LAA!="LAA") {
					EndlessCombinations(a,b, c, excelLOC, excelCYCLO);
					EndlessCombinations1(d, f, c, excelATFD, excelLAA, laa);

				}

			}
			for(Registo r : getMethodsWithError()) {
				erros.add(r.getInteger());
				System.out.println(r);
			}
			for(Registo r : getMethodsWithError1()) {
				erros1.add(r.getInteger());
				System.out.println(r);
			}

			JOptionPane.showMessageDialog(null, "Métodos com defeito (Long Method): " + getErros().toString() + "\n" + "Métodos com defeito (Feature Envy): " + getErros1().toString());

			//System.out.println("Métodos com defeito (Long Method): " + getErros().toString() + "\n" + "Métodos com defeito (Feature Envy): " + getErros1().toString());



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String OperationGetter(JComboBox jcb) {
		if(jcb.getSelectedItem().toString().equals("<"))
			return ("<");
		if(jcb.getSelectedItem().toString().equals(">"))
			return (">");
		if(jcb.getSelectedItem().toString().equals("<="))
			return ("<=");
		else
			return (">=");

	}


	public void EndlessCombinations(int a, int b, int c, XSSFCell excelLOC, XSSFCell excelCYCLO) {



		// LONG METHOD 

		if(OperationGetter(getComboBox()).equals("<") && OperationGetter(getComboBox_1()).equals("<"))
			if(!(excelLOC.getNumericCellValue() < a && excelCYCLO.getNumericCellValue() < b)){
				getMethodsWithError().add(new Registo(c,true));
//				todos.add(new Registo (c,false));
//			}else {
//				todos.add(new Registo (c,false));
			}
				
			
		if(OperationGetter(getComboBox()).equals("<") && OperationGetter(getComboBox_1()).equals(">"))
			if(!(excelLOC.getNumericCellValue() < a && excelCYCLO.getNumericCellValue() > b)){
				getMethodsWithError().add(new Registo(c,true));

			}
		if(OperationGetter(getComboBox()).equals("<") && OperationGetter(getComboBox_1()).equals("<="))
			//getTodos().add(new Registo (c,true));
			if(!(excelLOC.getNumericCellValue() < a && excelCYCLO.getNumericCellValue() <= b)){
				getMethodsWithError().add(new Registo(c,true));


			}
		if(OperationGetter(getComboBox()).equals("<") && OperationGetter(getComboBox_1()).equals(">="))
			//getTodos().add(new Registo (c,true));
			if(!(excelLOC.getNumericCellValue() < a && excelCYCLO.getNumericCellValue() >= b)){
				getMethodsWithError().add(new Registo(c,true));
	
			}





		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		if(OperationGetter(getComboBox()).equals(">") && OperationGetter(getComboBox_1()).equals("<"))
			//getTodos().add(new Registo (c,true));
			if(!(excelLOC.getNumericCellValue() > a && excelCYCLO.getNumericCellValue() < b)){
				getMethodsWithError().add(new Registo(c,true));

			

			}
		if(OperationGetter(getComboBox()).equals(">") && OperationGetter(getComboBox_1()).equals(">"))
			//getTodos().add(new Registo (c,false));
			if(!(excelLOC.getNumericCellValue() > a && excelCYCLO.getNumericCellValue() > b)){
				getMethodsWithError().add(new Registo(c,true));

		if(OperationGetter(getComboBox()).equals(">") && OperationGetter(getComboBox_1()).equals("<="))
			//getTodos().add(new Registo (c,true));
			if(!(excelLOC.getNumericCellValue() > a && excelCYCLO.getNumericCellValue() <= b)){
				getMethodsWithError().add(new Registo(c,true));
			}
			
		if(OperationGetter(getComboBox()).equals(">") && OperationGetter(getComboBox_1()).equals(">="))
			//getTodos().add(new Registo (c,true));
			if(!(excelLOC.getNumericCellValue() > a && excelCYCLO.getNumericCellValue() >= b)){
				getMethodsWithError().add(new Registo(c,true));
			}
			


		//<=<=<=<=<=<=<=<=<=<=
		if(OperationGetter(getComboBox()).equals("<=") && OperationGetter(getComboBox_1()).equals("<"))
			if(!(excelLOC.getNumericCellValue() <= a && excelCYCLO.getNumericCellValue() < b)){
				getMethodsWithError().add(new Registo(c,true));

			}
		if(OperationGetter(getComboBox()).equals("<=") && OperationGetter(getComboBox_1()).equals(">"))
			if(!(excelLOC.getNumericCellValue() <= a && excelCYCLO.getNumericCellValue() > b)){
				getMethodsWithError().add(new Registo(c,true));
			}
		if(OperationGetter(getComboBox()).equals("<=") && OperationGetter(getComboBox_1()).equals("<="))
			if(!(excelLOC.getNumericCellValue() <= a && excelCYCLO.getNumericCellValue() <= b)){
				getMethodsWithError().add(new Registo(c,true));
				


			}
		if(OperationGetter(getComboBox()).equals("<=") && OperationGetter(getComboBox_1()).equals(">="))
			if(!(excelLOC.getNumericCellValue() <= a && excelCYCLO.getNumericCellValue() >= b)){
				getMethodsWithError().add(new Registo(c,true));
				

			}





		//>=>=>=>=>=>=>=>=>=>=>=>=>=>
		if(OperationGetter(getComboBox()).equals(">=") && OperationGetter(getComboBox_1()).equals("<"))
			if(!(excelLOC.getNumericCellValue() >= a && excelCYCLO.getNumericCellValue() < b)){
				getMethodsWithError().add(new Registo(c,true));
				
			}
		if(OperationGetter(getComboBox()).equals(">=") && OperationGetter(getComboBox_1()).equals(">"))
			if(!(excelLOC.getNumericCellValue() >= a && excelCYCLO.getNumericCellValue() > b)){
				getMethodsWithError().add(new Registo(c,true));

			
			}

		if(OperationGetter(getComboBox()).equals(">=") && OperationGetter(getComboBox_1()).equals("<="))
			if(!(excelLOC.getNumericCellValue() >= a && excelCYCLO.getNumericCellValue() <= b)){

				getMethodsWithError().add(new Registo(c,true));

				
			}
		if(OperationGetter(getComboBox()).equals(">=") && OperationGetter(getComboBox_1()).equals(">="))
			if(!(excelLOC.getNumericCellValue() >= a && excelCYCLO.getNumericCellValue() >= b)){
				if(getMethodsWithError().contains(c))
					getMethodsWithError().add(new Registo(c,true));
				
			}
			}
	}

	//FEATURE ENVY 
	public void EndlessCombinations1(int d, double f, int c, XSSFCell excelATFD, XSSFCell excelLAA, double laa) {



		if(OperationGetter(getComboBox_4()).equals("<") && OperationGetter(getComboBox_5()).equals("<"))
			if(!(excelATFD.getNumericCellValue() < d && laa < f)){
				getMethodsWithError1().add(new Registo(c,true));
				

			}
		if(OperationGetter(getComboBox_4()).equals("<") && OperationGetter(getComboBox_5()).equals(">"))
			if(!(excelATFD.getNumericCellValue() < d && laa > f)){
				getMethodsWithError1().add(new Registo(c,true));
				

			}
		if(OperationGetter(getComboBox_4()).equals("<") && OperationGetter(getComboBox_5()).equals("<="))
			if(!(excelATFD.getNumericCellValue() < d && laa <= f)){
				getMethodsWithError1().add(new Registo(c,true));

				
			}
		if(OperationGetter(getComboBox_4()).equals("<") && OperationGetter(getComboBox_5()).equals(">="))
			if(!(excelATFD.getNumericCellValue() < d && laa >= f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}





		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		if(OperationGetter(getComboBox_4()).equals(">") && OperationGetter(getComboBox_5()).equals("<"))
			if(!(excelATFD.getNumericCellValue() < d && laa < f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}
		if(OperationGetter(getComboBox_4()).equals(">") && OperationGetter(getComboBox_5()).equals(">"))
			if(!(excelATFD.getNumericCellValue() < d && laa > f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}
		if(OperationGetter(getComboBox_4()).equals(">") && OperationGetter(getComboBox_5()).equals("<="))
			if(!(excelATFD.getNumericCellValue() < d && laa <= f)){
				getMethodsWithError1().add(new Registo(c,true));

				
			}
		if(OperationGetter(getComboBox_4()).equals(">") && OperationGetter(getComboBox_5()).equals(">="))
			if(!(excelATFD.getNumericCellValue() < d && laa >= f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}






		//<=<=<=<=<=<=<=<=<=<=
		if(OperationGetter(getComboBox_4()).equals("<=") && OperationGetter(getComboBox_5()).equals("<"))
			if(!(excelATFD.getNumericCellValue() < d && laa < f)){
				getMethodsWithError1().add(new Registo(c,true));

			}
		if(OperationGetter(getComboBox_4()).equals("<=") && OperationGetter(getComboBox_5()).equals(">"))
			if(!(excelATFD.getNumericCellValue() < d && laa > f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}
		if(OperationGetter(getComboBox_4()).equals("<=") && OperationGetter(getComboBox_5()).equals("<="))
			if(!(excelATFD.getNumericCellValue() < d && laa <= f)){
				getMethodsWithError1().add(new Registo(c,true));
				

			}
		if(OperationGetter(getComboBox_4()).equals("<=") && OperationGetter(getComboBox_5()).equals(">="))
			if(!(excelATFD.getNumericCellValue() < d && laa >= f)){
				getMethodsWithError1().add(new Registo(c,true));


			}





		//>=>=>=>=>=>=>=>=>=>=>=>=>=>
		if(OperationGetter(getComboBox_4()).equals(">=") && OperationGetter(getComboBox_5()).equals("<"))
			if(!(excelATFD.getNumericCellValue() < d && laa < f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}
		if(OperationGetter(getComboBox_4()).equals(">=") && OperationGetter(getComboBox_5()).equals(">"))
			if(!(excelATFD.getNumericCellValue() < d && laa > f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}
		if(OperationGetter(getComboBox_4()).equals(">=") && OperationGetter(getComboBox_5()).equals("<="))
			if(!(excelATFD.getNumericCellValue() < d && laa <= f)){

				getMethodsWithError1().add(new Registo(c,true));

			}
		if(OperationGetter(getComboBox_4()).equals(">=") && OperationGetter(getComboBox_5()).equals(">="))
			if(!(excelATFD.getNumericCellValue() < d && laa >= f)){
				getMethodsWithError1().add(new Registo(c,true));
				
			}

	}


}




