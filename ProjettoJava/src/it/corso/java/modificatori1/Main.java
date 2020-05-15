package it.corso.java.modificatori1;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		//il  metodo è definito public in Persona
		p.cammina();
		//il metodo è definito protected in Persona ed è nello stesso pkg
		p.mangia();
	}

}
