
package testes;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

import softeng.AvQualidade;
import softeng.Registo;

public class testeAvQualidade {

	AvQualidade av = new AvQualidade();
	JFrame jf = new JFrame();
	ArrayList<Registo> a = new ArrayList<>();
	List<Registo> b = new ArrayList<>();
	File file = null;
	XSSFWorkbook exp = new XSSFWorkbook();
	//	XSSFCell exp2 = new XSSFCell();
	//	FileInputStream fis = new FileInputStream(file); 



	@Test
	public void testGetTodos() {
		//		ArrayList<Registo> a = new ArrayList<Registo>();
		assertEquals(av.getTodos(), a);
	}

	@Test
	public void testMain() {
		av.main(null);
	}

	@Test
	public void testAvQualidade() {

	}

	@Test
	public void testGetDCI1() {
		int a = 0;
		//		int b = av.getDCI1();
		//		int a2 = a+1;
		//		if(b == a2)
		assertEquals(av.getDCI1(), a);
	}

	@Test
	public void testSetDCI1() {
		av.setDCI1(3);
		assertEquals(av.getDCI1(), 3);
	}


	@Test
	public void testGetDII1() {
		int a = 0;
		assertEquals(av.getDII1(), a);
	}


	@Test
	public void testSetDII1() {
		av.setDII1(3);
		assertEquals(av.getDII1(), 3);
	}

	@Test
	public void testGetADCI1() {
		int a = 0;
		assertEquals(av.getADCI1(), a);
	}

	@Test
	public void testSetADCI1() {
		av.setADCI1(3);
		assertEquals(av.getADCI1(), 3);
	}

	@Test
	public void testGetADII1() {
		int a = 0;
		assertEquals(av.getADII1(), a);
	}

	@Test
	public void testSetADII1() {
		av.setADII1(3);
		assertEquals(av.getADII1(), 3);
	}

	@Test
	public void testGetDCI2() {
		int a = 0;
		assertEquals(av.getDCI2(), a);
	}

	@Test
	public void testSetDCI2() {
		av.setDCI2(3);
		assertEquals(av.getDCI2(), 3);
	}

	@Test
	public void testGetDII2() {
		int a = 0;
		assertEquals(av.getDII2(), a);
	}

	@Test
	public void testSetDII2() {
		av.setDII2(3);
		assertEquals(av.getDII2(), 3);
	}

	@Test
	public void testGetADCI2() {
		int a = 0;
		assertEquals(av.getADCI2(), a);
	}

	@Test
	public void testSetADCI2() {
		av.setADCI2(3);
		assertEquals(av.getADCI2(), 3);
	}

	@Test
	public void testGetADII2() {
		int a = 0;
		assertEquals(av.getADII2(), a);
	}
	@Test
	public void testSetADII2() {
		av.setADII2(3);
		assertEquals(av.getADII2(), 3);
	}

	@Test
	public void testGetDCI() {
		int a = 0;
		Assert.assertEquals(av.getDCI(), a);
	}

	@Test
	public void testSetDCI() {
		av.setDCI(3);
		assertEquals(av.getDCI(), 3);
	}

	@Test
	public void testGetDII() {
		int a = 0;
		assertEquals(av.getDII(), a);
	}

	@Test
	public void testSetDII() {
		av.setDII(3);
		assertEquals(av.getDII(), 3);
	}

	@Test
	public void testGetADCI() {
		int a = 0;
		assertEquals(av.getADCI(), a);
	}

	@Test
	public void testSetADCI() {
		av.setADCI(3);
		assertEquals(av.getADCI(), 3);
	}

	@Test
	public void testGetADII() {
		int a =0;
		Assert.assertEquals(av.getADII(), a);
	}
	@Test
	public void testSetADII() {
		av.setADII(3);
		assertEquals(av.getADII(), 3);
	}

	@Test
	public void testGetDCI3() {
		int a = 0;
		assertEquals(av.getDCI3(), a);
	}
	@Test
	public void testSetDCI3() {
		av.setDCI3(3);
		assertEquals(av.getDCI3(), 3);
	}

	@Test
	public void testGetDII3() {
		int a = 0;
		assertEquals(av.getDII3(), a);
	}

	@Test
	public void testSetDII3() {
		av.setDII3(3);
		assertEquals(av.getDII3(), 3);;
	}

	@Test
	public void testGetADCI3() {
		int a = 0;
		Assert.assertEquals(av.getADCI3(), a);
	}

	@Test
	public void testSetADCI3() {
		av.setADCI3(3);
		assertEquals(av.getADCI3(), 3);
	}

	@Test
	public void testGetADII3() {
		int a = 0;
		Assert.assertEquals(av.getADII3(), a);
	}
	@Test
	public void testSetADII3() {
		av.setADII3(3);
		assertEquals(av.getADII3(), 3);
	}

	@Test
	public void testGetIs_long_method() {
		assertEquals(av.getIs_long_method(), exp);
	}

	@Test
	public void testSetIs_long_method() {
		//		av.setIs_long_method(exp);
	}

	@Test
	public void testGetExcelfis() {
		//		assert(av.getExcelfis(), )
	}

	@Test
	public void testSetExcelfis() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetExcelbis() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetExcelbis() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetExcelJPanelImport() {
		assertEquals(av.getExcelJPanelImport(), exp);
	}

	@Test
	public void testSetExcelJPanelImport() {
		//		av.getExcelJPanelImport(exp);
	}

	@Test
	public void testGetJanelaiPlasma() {
		assertEquals(av.getJanelaiPlasma(), jf);
	}

	@Test
	public void testSetJanelaiPlasma() {
		av.setJanelaiPlasma(jf);
	}

	@Test
	public void testSetTodos() {
		av.setTodos(b);
	}

	@Test
	public void testGetMWE() {
		assertEquals(av.getMWE(), a);
	}


	@Test
	public void testSetMWE() {
		av.setMWE(b);
	}

	@Test
	public void testIPlasma() {
		fail("Not yet implemented");
	}

	@Test
	public void testPMD() throws IOException {


		File excel = null;
		String s = "TRUE";
		String w = "TRUE";		
		av.PMD(excel);
		//		assertEquals(,);
		//

	}

	@Test
	public void testAvRegras() {
		fail("Not yet implemented");
	}

}