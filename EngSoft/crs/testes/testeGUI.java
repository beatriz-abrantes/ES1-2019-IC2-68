package testes;

import static org.junit.Assert.*;

import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.junit.Test;

import junit.framework.Assert;
import softeng.ES;
import softeng.Registo;

public class testeGUI {
	ES es = new ES();
	ArrayList<Registo> a = new ArrayList<>();

	
	@Test
	public void testGetMethodsWithError() {
		Assert.assertEquals(a, es.getMethodsWithError());
		
		
	}

//	@Test 
//	public void testGetTodos() {
//		Assert.assertEquals(a, es.getTodos());
//	}

	@Test
	public void testGetErros() {
		Assert.assertEquals(a, es.getErros());
	}

	@Test
	public void testGetErros1() {
		Assert.assertEquals(a, es.getErros1());
	}



	@Test
	public void testGetMethodsWithError1() {
		assertEquals(a, es.getMethodsWithError1());
	}


	@Test
	public void testMain() {
		es.main(null);
	}

	@Test
	public void testES() {
		ES es1 = new ES();
		es1.initialize();
		es1.addTableHeader();
	}

	@Test
	public void testAddTableHeader() {
		es.addTableHeader();
	}

	@Test
	public void testGetComboBox() {
		JComboBox c = new JComboBox();
	}

	@Test
	public void testGetComboBox_1() {
		JComboBox c = new JComboBox();
	
	}

	@Test
	public void testGetComboBox_4() {
		JComboBox c = new JComboBox();
	
	}

	@Test
	public void testGetComboBox_5() {
		JComboBox c = new JComboBox();
	
	}

	@Test
	public void testGetTextField() {
		TextField c = new TextField();
		es.getTextField();
	}

	@Test
	public void testGetTextField_1() {
		
	}

	@Test
	public void testGetTextField_2() {
		TextField ola = new TextField();
		 es.getTextField_2();
	}

	@Test
	public void testGetTextField_3() {
		TextField ola = new TextField();
		es.getTextField_3();
	}

	@Test
	public void clicar() {
		es.clicarmostrarexcel();
	}
	
	@Test
	public void clicar1() {
		es.clicarmostriplasma();
		
	}
	@Test
	public void clicar2() {
		es.clicarmostrpmd();
		
	}
	@Test
	public void clicar3() {
		es.clicarmostra();
		
	}
	@Test
	public void clicar4() {
		es.clicarmostrarb();
		
	}

	
}
