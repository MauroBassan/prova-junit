package it.corso.java.liste;

import it.corso.java.oop.gestionale.Smartphone;

public class TestArray {

	public static void main(String[] args) {
		TestArray tl = new TestArray();
		tl.creaArray();
		tl.arrayMultidim();

	}
	
	public void creaArray() {
		
		int[] numeri = new int[10];
		// assegno un valore ad ogni indice dell'array numeri:
		//numeri[0] = 10;
		// numeri[1] = 11 >>> OPPURE >>>
		// con un ciclo for popolo l'array 
		for(int i = 0; i < 10; i++ ) {
			
			numeri[i] = i;
		}
		//ora leggo array sempre con un foreach
		for (int n : numeri) {
			System.out.println(n);
		}
		
		Smartphone [] prodotti = new Smartphone[2];
		// creo nuovi oggetti x popolare l'array prodotti
		prodotti[0] = new Smartphone();
		// una volta creato l'oggetto che l'array prende, popolo gli attributi dell'oggetto
		prodotti[0].setMarca("apple");
		prodotti[0].setNome("iphone");
		
		prodotti[1] = new Smartphone();
		prodotti[1].setMarca("samsung");
		prodotti[1].setNome("note10");
		
		//leggo i prodotti presenti nell'array con un ciclo foreach
		for(Smartphone sm : prodotti) {
			System.out.println(sm.getMarca() + " "+sm.getNome());
		}
		
	}

	public void arrayMultidim() {
		int [][] matrice = new int[10][10];
		
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				matrice[i][j]= i +j;
			}
		}
	
		
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {	
			System.out.println(matrice[i][j]);
		}
	}
}


/* MATRICE 10 X 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 */
}