package it.corso.java.wrapper;

public class TestWrapp {

	public static void main(String[] args) {
		int a = 10;
		// con una classe wrapper ho una serie di metodi a disposizione
		/* caso di BOXING */
		Integer b = new Integer(10);
		//in questo caso a alla var c assegno il valore di a.
		/* caso di BOXING */
		Integer c = new Integer(a);
		Double d1 = new Double(10.5);
		
		double d2= 11.1;
		Double d3 = new Double(d2);
		
		/* caso di AUTO-BOXING */
		Integer var4 = 10;
		Double d4 = 15.6;
		Boolean var6 = false;
		
		/* caso di UNBOXING */
		int var7 = var4; // praticamente ho reso Integer 10, una variabile di tipo primitivo.
	}

}
