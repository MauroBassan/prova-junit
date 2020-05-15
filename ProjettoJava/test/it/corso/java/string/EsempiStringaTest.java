package it.corso.java.string;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsempiStringaTest {

//	@Test
//	void testIsPalindroma() {
//		fail("Not yet implemented");
//	}

	@Test
	void testContaOccorrenze() {
		EsempiStringa e = new EsempiStringa();
		
		String testo = "oggi piove";
		
		int oc = 2;
		
		assertEquals("il numero di occorrenze è diverso da quello atteso", oc, e.contaOccorrenze(testo, "o"));
			
	}

}
