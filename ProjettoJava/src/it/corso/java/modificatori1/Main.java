package it.corso.java.modificatori1;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		//il  metodo � definito public in Persona
		p.cammina();
		//il metodo � definito protected in Persona ed � nello stesso pkg
		p.mangia();
	}

}
