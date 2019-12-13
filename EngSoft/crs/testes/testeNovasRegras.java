package testes;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JComboBox;

import org.junit.jupiter.api.Test;

import softeng.RegrasNovas;

class testeNovasRegras {

	@Test
	public void testOperationGetter() {
		String [] options = {"<", ">", "<=", ">="};
		
		RegrasNovas rn = new RegrasNovas();
		JComboBox cb = rn.getComboBox();
		
		
		for (int i = 0; i < options.length; i++) {
			cb.setSelectedIndex(i);
			String op = rn.OperationGetter(cb);
			String selectOp = (String) cb.getSelectedItem();
			assertEquals(op, selectOp);
		}
			
		
	}

}
