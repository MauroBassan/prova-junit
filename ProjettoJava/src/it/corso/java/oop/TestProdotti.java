package it.corso.java.oop;

import java.util.List;

public class TestProdotti {

	public static void main(String[] args) {

		Libro l1 = new Libro();
		// ereditato in automatico il metodo getDescr dalla classe Prodotto
		l1.getDescrizione();
		
		Prodotto p = new Prodotto();
		List<String> s1 = p.getStores();
		System.out.println("negozi PRODOTTO: ");
		for (String s : s1 ) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		
		Libro l = new Libro();
		List<String> s2 = l.getStores();
		System.out.println("negozi Libro: ");
		for (String s : s2) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		
		Dvd d = new Dvd();
		List<String> s3 = d.getStores();
		System.out.println("negozi Dvd: ");
		for (String s : s3) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		
		
		Televisore tv = new Televisore();
		tv.setNome("oled 55");
		//List<String> s4 = tv.getStores();
		//System.out.println("negozi Tv: ");
		//for (String s : s4) {
		//	System.out.println(s);
		//}
		//se non scelgo di creare in List di <String> con il metodo print mi ritorna una array di negozi
		System.out.println(tv.getStores());
		System.out.println("-------------------");
		
		System.out.println(tv.getNome());
	}

}
