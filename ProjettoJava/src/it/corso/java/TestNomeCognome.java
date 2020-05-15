package it.corso.java;

import java.util.Date;

public class TestNomeCognome {

	public static void main(String[] args) {
		TestNomeCognome test = new TestNomeCognome();
		System.out.println("--- #1 stampa semplice ---");
		test.stampaNomeCognome("mauro", "bassan");
		
		System.out.println("--- #2 stampa concat ---");
		System.out.println(test.concatNomeCognome("mauro", "bassan"));
		
		System.out.println("--- #3 stampa concat UpperLower ---");
		System.out.println(test.concat2("mauro", "bassan", true));
		System.out.println(test.concat2("MAURO", "BASSAN", false));
		
		System.out.println("--- #4 stampa semplice ---");
		System.out.println(test.sottostringa("ciaociaociao"));
		System.out.println(test.sottostringa("ok"));
		
		ArticoloGiornale ag = new ArticoloGiornale(1, "nuovo", "corto", "oggi sono andato a fare shopping con anna", "mauro", new Date(), new Date());
		System.out.println(ag.contaCaratteri());
		System.out.println(ag.contaPalindrome());
	}

	private void stampaNomeCognome(String n, String C) {
		
		System.out.println("ciao " + n +" "+C);
		
	}
	
	private String concatNomeCognome(String n, String c) {
		
		return n.concat(c);
		
	}
	
	private String concat2(String n, String c, boolean stampaMaiuscolo) {
		
		if(stampaMaiuscolo == true) {
			return n.concat(c).toUpperCase();
		} 
			return n.concat(c).toLowerCase();
	}
	
	private String sottostringa(String testo) {
		
		if(testo.length() > 3) {
			return testo.substring(0, 3);
		}
		
		return testo;
	}
	
}
