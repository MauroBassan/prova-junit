package it.corso.java.oop;

import java.lang.reflect.Method;

public class TestMetodoGetClass {

	public static void main(String[] args) {
		
		TestMetodoGetClass t = new TestMetodoGetClass();
		t.stampaInfo();
		

	}
	
	public void stampaInfo() {
		//prende il nome del pacchetto completo, vedi output!
		System.out.println(getClass().getName());
		// prende il nome della classe semplice quindi TestMetodoGetClass
		System.out.println(getClass().getSimpleName());
		
		System.out.println("");
		System.out.println("metodi:::");
		for (Method m : getClass().getMethods()) {
			System.out.println(m.getName());
		}
	}

}
