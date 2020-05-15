package it.corso.java.liste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.corso.java.oop.gestionale.Smartphone;

public class TestIterator {

	public static void main(String[] args) {
		TestIterator ti = new TestIterator();
		ti.esempioIterazione();

	}

	public void esempioIterazione() {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("mro");
		lista.add("lgi");
		lista.add("alby");
		
		
		/* for 1*/
		for (int i = 0; i < lista.size(); i ++) {
					System.out.println(lista.get(i));
		}
		
		System.out.println("----------");
		
		/* for 2*/
		for (int i = 0; i < lista.size(); i ++) {
			String nome = lista.get(i);
					System.out.println(nome);
		}
		
		System.out.println("----------");
		
		/* foreach migiore da java 5 in poi*/
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("----------");
		
		/* iterator */
		Iterator<String> it = lista.iterator();
		
		while (it.hasNext()) {
			String nome = it.next(); // ritorna l'elemento successivo nell'iterazione
			System.out.println(nome);
		}
		
		Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();
		
		Smartphone sm = new Smartphone();
		sm.setMarca("apple");
		sm.setNome("iphone");
		
		mappa.put(sm.getNome(), sm);
		
		Smartphone sm2 = new Smartphone();
		sm2.setMarca("samsung");
		sm2.setNome("galaxy");
		
		mappa.put(sm2.getNome(), sm2);
		
		Set<String> chiavi = mappa.keySet();
		
		System.out.println("----------");
		/* non possiamo usare il ciclo for normale perchè nelle maps non esiste il metodo .get(i)  x accedere all'elemento iesimo!*/
		/* foreach migiore da java 5 in poi*/
		for(String s : chiavi) {
			System.out.println(s);
		}
		
		System.out.println("----------");
		
		/* iterator */
		Iterator<String> it2 = chiavi.iterator();
		
		while (it2.hasNext()) {
			String key = it2.next(); // ritorna l'elemento successivo nell'iterazione
			System.out.println(key);
		}

	}
}
