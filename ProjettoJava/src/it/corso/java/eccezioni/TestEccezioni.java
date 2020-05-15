package it.corso.java.eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestEccezioni {

	public static void main(String[] args) {
		File f = new File("test.txt");
		
		f.exists();
		
//		try {
//			FileReader fr = new FileReader(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		TestEccezioni t = new TestEccezioni();
		//in questo caso testo è null, quindi avrò una eccezione!
		//t.stampaTesto(null);
		// riproviamo avendo riscritto il metodo
		t.stampaTesto("prova");
		// mando in esecuzione stampaTesto2 x vedere eccezione, commentando l'if
		t.stampaTesto2(null);
		
		// eseguo stampaTesto3
		try {
			t.stampaTesto3(null);
		} catch (NewException e) {
			//invoco il metodo getMessage della mia classe che abbiamo sovrascritto con una frase di return.
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	
		try {
			t.esegui(null);
		} catch (NewException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ECCOMI DOPO ESEGUI!");
	}
	
	private void stampaTesto(String testo) {
		//if(testo != null) {
			String tmp = testo.concat("...");
			System.out.println(tmp);
		//} else  {
			//System.out.println("la variabile testo è NULL!");
		//}
	}
	
		private void stampaTesto2(String testo) {
			try{
				stampaTesto(testo);
				
				int val = 10;
				
				if(testo != null && testo.length() < val) {
					System.out.println("il testo ha meno di " + val + "caratteri!");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("SONO NEL FINALLY!");
			}
		}
		
		private void stampaTesto3(String testo) throws NewException {
			if(testo == null) {
				throw new NewException();
			}
			stampaTesto(testo);
		}
		
		// in questo metodo demando ancora l'eccezione!! 
		private String esegui(String testo) throws NewException {
			stampaTesto3(testo);
			return "ho stampato il testo";
		}

	}
