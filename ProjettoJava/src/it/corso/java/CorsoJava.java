package it.corso.java;

/**
 * 
 * prova creazione documentazione con javadoc
 * 
 * In particolar modo in questa classe vediamo:
 * <ul>
 * 	<li>l'elenco degli elementi di una classe</li>
 * 	<li>l'elenco dello scope delle variabili</li>
 * <li>varie nozioni sulle stringhe</li>
 * </ul>
 * @author Mro Bsn
 * @since 1.0
 */



public class CorsoJava {
	//variabile di istanza
	int b = 5;
	// variabile di classe
	public static String saluta = "CIAO";
	
	/* variabili */
	private int contatore = 0;
	
	/* costruttori */
	public CorsoJava() {
		super();
	}
	
	/* metodi */
	public static void main(String[] args) {
		
		//variabile locale
				int a = 10;
		
		//cancellare una riga: ctrl+D
		System.out.println("Ciao!");
		
		CorsoJava c1 = new	CorsoJava();
		// modifico la var di istanza (c1)
		c1.b = 10;
		
		CorsoJava c2 = new CorsoJava();
		// modifico la var di istanza (c2)
		c2.b = 30;
		
		// dichiaro e inizializzo variabile
		CorsoJava c3 = new CorsoJava();
		
		// stampo il valore della var statica
 		System.out.println(CorsoJava.saluta);
 		
 		// TIPI di dato, esercizio su Stringa:
 		String test = "ciao";
 		byte [] testAr = test.getBytes();
 		for (int i = 0; i < testAr.length; i++) {
 			System.out.println(testAr[i]);
 			//stampo in byte il valore delle lettere
 		}
 		
 		// LE STRINGHE
 		
 		String s = "esercitazione java base";
 		
 		String s1 = "";
 		String s2;
 		String s3 = new String("Stringa 3");
 		//oppure da un array di char!
 		char [] array = {'S','t','r','i','n','g','a'};
 		String s4 = new String(array);
 		
 		/* 
 		 * Lavorare sulle stringhe:
 		 * - concatenazione: + / Str1.concat(Str2)
 		 * - replace ... str.replace("ava", "4"); ovvero replace il pattern indicato : J4 
 		 * - replaceAll ... str.replaceAll("[a-n]+","4") : sostituisce tutti i valori tra le [] con il num 4
 		 * - replaceFirst ... str.replaceFirst("[a-n]+", "4") : sostituisce i valori tra le [] con il 4 SOLO alla prima occorrenza
 		 * - str.startsWith("metto i caratteri con ciu inizia stringa") restituisce true o false
 		 * - str.endsWith("metto i caratteri con ciu finisce stringa") restituisce true o false
 		 * - str.charAt(3) restituisce il carattere nella stringa presente all'indice indicato
 		 */ 
 		// +++ ESTRAZIONE metodo Substring
 		//dicendo da quale indice iniziare
 		String s5 = s.substring(4);
 		System.out.println(s5);
 		// oppure dal indice x, al indice y
 		String s6 = s.substring(2, 5);
 		System.out.println(s6);
 		
 		String s7 = "Mro Bsn";
 		String s8 = "mro bsn";
 		// str.split() divide la str in un array di stringhe
 		String [] sArr = s7.split(" ");
 		for ( int i = 0; i < sArr.length; i++ ) {
 			System.out.println(sArr[i]);
 			}
 		
 		 
 		
 		/* confronti fra Stringhe:
 		 metodo equals(confronta gli oggetti) oppure equalsIgnoreCase()
 		 */
	}

		// esempio di paramentri tra le () del metodo
	public String concatena( String stringa1, String stringa2) {
		
		return stringa1.concat(stringa2);
		}
	
	
	public String concatena(String...vars) {
		String out = " ";
				
		for (int i = 0; i < vars.length; i++) {
			out += vars[i];
		}
				
		return out;
	}
	
}
