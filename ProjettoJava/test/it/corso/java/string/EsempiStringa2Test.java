package it.corso.java.string;

import static org.junit.Assert.*;


import org.junit.jupiter.api.Test;

class EsempiStringa2Test {
	EsempiStringa e = new EsempiStringa();
	@Test
	void testIsPalindroma() {
		assertTrue("la variabile è falsa!", e.isPalindroma("maria"));
	}

	@Test
	void testContaOccorrenze() {
		EsempiStringa e = new EsempiStringa();
		
		String testo = "oggi piove";
		
		int oc = 2;
		
		assertEquals("il numero di occorrenze è diverso da quello attes", oc, e.contaOccorrenze(testo, "o"));
	
		assertNull("la variabile non è null" + e);
			
	}

}
