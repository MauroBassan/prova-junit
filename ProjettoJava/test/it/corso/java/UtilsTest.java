package it.corso.java;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class UtilsTest {
	
	private int numeroTestato;
	private boolean risultatoAtteso;

	
	
//	public UtilsTest(int numeroTestato, boolean risultatoAtteso) {
//		super();
//		this.numeroTestato = numeroTestato;
//		this.risultatoAtteso = risultatoAtteso;
//	}
	
	@Parameterized.Parameters
	public static Collection dataset() {
		return Arrays.asList(new Object[][] {
			new Object[] {1, false},
			{2, true},
			{3, false},
			{4, true},
			{5, false},
			{6, true},
			{7, false},
			{8, true},
			{9, false},
			{10, true},
		});
	}
	
	@Test
	public void testNumeroPari() {
		Utils u = new Utils();
		
		System.out.println("Eseguo il test con il numero: " + numeroTestato);
		assertEquals("il numero " + numeroTestato +" � dispari", risultatoAtteso, u.numeroPari(numeroTestato));
	}

}