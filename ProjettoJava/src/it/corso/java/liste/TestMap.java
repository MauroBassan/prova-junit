package it.corso.java.liste;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.corso.java.oop.gestionale.Smartphone;

public class TestMap {

	public static void main(String[] args) {
		TestMap tm = new TestMap();
		
		tm.esempioHashMap();
		

	}

	public void esempioHashMap() {
		Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();
		
		Smartphone sm = new Smartphone();
		sm.setMarca("apple");
		sm.setNome("iphone");
		
		mappa.put(sm.getNome(), sm);
		
		Smartphone sm2 = new Smartphone();
		sm2.setMarca("samsung");
		sm2.setNome("galaxy");
		
		mappa.put(sm2.getNome(), sm2);
		
		Smartphone sm3 = mappa.get("iphone");
		System.out.println(sm3.getMarca() +" " + sm3.getNome());
		
		System.out.println(mappa.size());
		
		System.out.println(" contiene la chiave iphone? " + mappa.containsKey("iphone"));
		//svuoto la mappa, se rifaccio mappa.size(), l output sarà 0
		//mappa.clear();
		
		// mappa.remove("samsung"); x rimuovere quella entry.
		
		System.out.println(mappa.keySet());
		// proviamo a ITERARE SU TUTTE LE CHIAVI:
		Set<String> chiavi = mappa.keySet();
		System.out.println("chiavi presenti nella mappa:");
		for (String string : chiavi) {
			System.out.println(string);
		}
	}
}
