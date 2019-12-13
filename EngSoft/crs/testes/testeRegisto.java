package testes;



import org.junit.Test;
import static org.junit.Assert.*;

import softeng.Registo;

public class testeRegisto {

	@Test
	public void test_registo() {
		Registo r = new Registo (5, true);
		assertEquals(5, r.getInteger());	
	}
	
	@Test
	public void test_registo1() {
		Registo r = new Registo (5, true);
		assertTrue(r.isBool());	
	}

	@Test
	public void test_registo2() {
		Registo r = new Registo (5, true);
		assertEquals(true, r.isBool());	
	}
	
	@Test
	public void test_registo3() {
		Registo r = new Registo (5, true);
		assertEquals("Registo [integer=5, bool=true]", r.toString());	
	}
	
	@Test
	public void test_registo4() {
		Registo r = new Registo (5, true);
		r.setBool(false);
		assertFalse(r.isBool());	
	}
}
