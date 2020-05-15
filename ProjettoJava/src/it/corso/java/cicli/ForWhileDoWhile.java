package it.corso.java.cicli;

public class ForWhileDoWhile {
	//WHILE
	public void iteraWhile(int contatore, int estremo) {
		System.out.println("test ciclo WHILE...");
		while (contatore < estremo) {
			System.out.println("contatore vale: " + contatore);
			contatore ++;
		}
		System.out.println("sono uscito dal ciclo!");
		System.out.println("-----------------------");
	}
	
	public void iteraWhileModulo ( int inizio, int fine) {
		System.out.println("++++++++++++++++++++++++++++++++++++");
		while (inizio < fine) {
			if(inizio % 2 == 0) {
				
				//System.out.println("pari: " + inizio);
				inizio++;
				continue;
			}		
			System.out.println(inizio);
			inizio++;
		}
		System.out.println("fine ciclo while\n +++++++++++++++++++++++++++++++++++");
	}
	
	// DO WHILE
	public void iteraDowhile(int contatore, int estremo) {
		System.out.println("test ciclo DO while...");
		do {
			System.out.println("contatore vale: " + contatore);
			contatore ++;
		}
		while (contatore < estremo);
		System.out.println("sono uscito dal ciclo!");
		System.out.println("-----------------------");
	}

	//CICLO FOR
	public void iteraFor(int contatore) {
		System.out.println("test ciclo FOR...");
		for (int i = 0; i < contatore; i++) {
			System.out.println(i);
		}
		System.out.println("sono uscito dal ciclo!");
		System.out.println("-----------------------");
	}
	
	//CICLO FOR su un ARRAY
	public void iteraArr(String[] arr) {
		if(arr != null ) {
			System.out.println("test ciclo FOR in ARRAY...");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("sono uscito dal ciclo!");
		System.out.println("-----------------------");
	}
	
	// CICLO FOREACH
	
	// con String
	public void iteraArr2(String[] arr) {
		if(arr != null ) {
			System.out.println("test ciclo FOREACH in String[]...");
			for (String string : arr) {
				System.out.println(string);
			}
		}
		System.out.println("sono uscito dal ciclo!");
		System.out.println("-----------------------");
	}
	
	
	// con gli int
	public void iteraArr2(int[] arr) {
		if(arr != null ) {
			System.out.println("test ciclo FOREACH in int[]...");
			for (int j : arr) {
				System.out.println(j);
			}
		}
		System.out.println("sono uscito dal ciclo!");
		System.out.println("-----------------------");
	}
}
