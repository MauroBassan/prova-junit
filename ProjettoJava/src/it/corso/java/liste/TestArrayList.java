package it.corso.java.liste;

import java.util.ArrayList;
import java.util.List;

import it.corso.java.oop.gestionale.Smartphone;

public class TestArrayList {

	public static void main(String[] args) {
		TestArrayList tal = new TestArrayList();
		
		tal.esempioArrayList();

	}

		public void esempioArrayList() {
			
			List<String> lista = new ArrayList<String>();
			lista.add("mro");
			lista.add("lgi");
			lista.add("alby");
			//ora inserisco all'indice 2 un altro nome:
			lista.add(2, "gg");
			//se invece volessi proprio sostituire con un altro nome: lista.set(index, element)
			
			for(String s : lista) {
				System.out.println(s);
			}
			
			System.out.println("contiene: " + lista.size() + " elementi");
			System.out.println("lista vuota: " + lista.isEmpty());
			
			System.out.println("------");
			
			//ora rimuovo l'indice 1:
			lista.remove(1);
			for(String s : lista) {
				System.out.println(s);
			}
			
			// per stampare la lista in formato array:
			System.out.println(lista.toString());
			
			// x trasformare la lista in un Array:
			// nel primo caso faccio un cast ma non è sempre sicuro
			//String [] listaArray1 = (String[]) lista.toArray(); SE LO ESEGUO NON RIESCE A CASTARE
			// nel secondo caso invece passo in ingresso al metodo to array, un nuovo array che avra come dimensione il num di elementi nella Arraylist.
			String [] listaArray2 = lista.toArray(new String[lista.size()]); 
			
			for ( String s : listaArray2) {
				System.out.println("array: " + s);
			}
			
			List<Smartphone> lista2 = new ArrayList<Smartphone>();
			Smartphone sm = new Smartphone();
			sm.setMarca("apple");
			sm.setNome("iphone");
			lista2.add(sm);
			
			Smartphone sm2 = new Smartphone();
			sm2.setMarca("samsung");
			sm2.setNome("galaxy");
			lista2.add(sm2);
			
			// per trasformare la lista in array, ma inquesto caso dara come output l'elenco delle istanze della classe smartphone
			System.out.println(lista2.toString());
		}
	
}
