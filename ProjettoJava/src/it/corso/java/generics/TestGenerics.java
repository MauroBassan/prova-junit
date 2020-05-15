package it.corso.java.generics;

import java.util.ArrayList;
import java.util.List;

import it.corso.java.classiinnerlocali.Appartamento;

public class TestGenerics {
	
	public static void main(String[] args) {
		
		/* senza generics*/
		List lista1 = new ArrayList();
		
		lista1.add("es1");
		lista1.add("es2");
		lista1.add(new Appartamento());
		// non essendo parametri definiti quelli in lista1, java ci chiede il casting
		String test1 = (String) lista1.get(0);
		
		/* con generics*/
		List<String> lista2 = new ArrayList<String>();
		lista2.add("es3");
		lista2.add("es4");
		//lista2.add(new Appartamento()); --non prende appartamento perchè non è String
		String test2 = lista2.get(0);
	}

}
