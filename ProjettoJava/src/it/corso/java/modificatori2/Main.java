package it.corso.java.modificatori2;

import it.corso.java.modificatori1.Persona;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		// vedo solo metodo cammina che � definito come public in Persona
		p.cammina();
		
		// i metodi default non li vedo perch� non sono nello stesso pkg e la classe Main non estende Persona

	}

}
