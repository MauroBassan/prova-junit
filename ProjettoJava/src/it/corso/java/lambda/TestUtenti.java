package it.corso.java.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestUtenti {

	public static void main(String[] args) {
		
		TestUtenti t = new TestUtenti();
		// prendiamo dal metodo elencoUtenti, la lista di tutti gli utenti che abbiamo aggiunto
		List<Utente> elenco = t.elencoUtenti();
		
		/* creo un'altra Lista e la chiamiamo trovati che è = t.cercaUtenti(...)
		 * a cui passo in ingresso una lista di tutti gli utenti ( quindi elenco) istanziata sopra,
		 * e il predicato che è una espressione lambda: 
		 * cerchiamo tutti gli utenti che hanno nome mauro: precidate prende in ingresso un Tipo e ritorna true o false!
		 * se l'utente ha nome mauro, viene messo nella lista
		 */
		List<Utente> trovati = t.cercaUtenti(elenco, utente -> utente.getNome().equals("mauro"));
		
		for (Utente utenteTrovato : trovati) {
			System.out.println(utenteTrovato.getCognome() + " " + utenteTrovato.getNome());		
		}
		
		System.out.println("----------------------");
		
		/* Function con Interfaccia Consumer accetta arg in ingresso e non ritorna valori */
		// FROM JAVA8:
		Consumer<Utente> cons = utente -> System.out.println(utente.getCognome() + " " + utente.getNome());
		elenco.forEach(cons);
		
		System.out.println("----------oppure prima di java8 #1: Foreach------------");
		
		// BEFORE JAVA8 ciclo foreach:
		for (Utente utente2 : elenco) {
			System.out.println(utente2.getCognome() + " " + utente2.getNome());
		}
		
		System.out.println("----------oppure prima di java8 #2: Iterator------------");
		
		//OPPURE BEFORE JAVA8 Iterator:
		Iterator<Utente> it = elenco.iterator();
		while(it.hasNext()) {
			//il contenuto dell'iterator è un utente
			Utente u = it.next();
			System.out.println(u.getCognome() + " " + u.getNome());
		}

		System.out.println("----------oppure prima di java8: Interfaccia Function------------");
		 double a = 4;
		 t.calcolaOperazione(a,  val -> val * val);
		 t.calcolaOperazione(a,  val -> Math.sqrt(val));
		
		 System.out.println("----------oppure prima di java8: Unary Operator------------");
		 
		 /* interfaccia UnaryOperator riproduce una operazione su un solo operando*/
		 // l'espressione lambda è: data la str, ritorna la str.tolowercase()
		 UnaryOperator<String> unop = str -> str.toLowerCase();
		 // dato un valore ritorna il valore*valore
		 UnaryOperator<Long> unop2 = val -> val*val;
		 
		 System.out.println(unop.apply("PRIMA ERO MAIUSCOLO!"));
		 
		 long num = 10;
		 System.out.println("il quadrato di " + num + " è uguale a = " + unop2.apply(num));
		 
		 
		 
		 System.out.println("----------oppure prima di java8: Binary Operator------------");
		 /* interfaccia BinaryOperator riproduce una operazione su 2 operandi e produce un risultato dello stesso tipo degli operandi*/
		 // l'espressione lambda è: data la str, ritorna la str.tolowercase()
		 BinaryOperator<Double> biop = (a1, a2) -> a1 * a2;
		
		 double x = 10.5;
		 double y = 2;
		 System.out.println(biop.apply(x, y));	 
		 
		 
		 System.out.println("----------oppure prima di java8: Binary Operator------------");
		 
		 BinaryOperator<String> biop2 = (s1, s2) -> "Ciao " + s1 + " "+ s2;
		 
		 List<Utente> utenti = t.elencoUtenti();
		 for (Utente utente : utenti) {
			 System.out.println(biop2.apply(utente.getNome(), utente.getCognome()));
		}
		 	
	}



	
	/* Esempio Interfaccia Function rappresenta una funzione che accetta params in ingresso e produce un risultato ritornando un valore 
	 * utile per quando dobiamo passare in input ad un metodo un blocco di codice
	 * */
	public void calcolaOperazione(double operando, Function<Double, Double> funzione) {
		double risultato = funzione.apply(operando);
		System.out.println("il risultato dell'operazione è: " + risultato);;
	}
	
	
	private List<Utente> elencoUtenti() {
		List<Utente> utenti = new ArrayList<Utente>();
		
		utenti.add(new Utente("mauro", "bassan", 37, "milano", "fdjfh@djhsdjkh", "test"));
		utenti.add(new Utente("luigi", "gabellotti", 30, "milano", "fdjfh@abcabc", "test"));
		utenti.add(new Utente("nicola", "donnantuoni", 42, "milano", "eeeeee@djhsdjkh", "test"));
		utenti.add(new Utente("mirko", "destro", 40, "milano", "aaaaaa@djhsdjkh", "test"));
		utenti.add(new Utente("davide", "surace", 44, "milano", "tttttttt@djhsdjkh", "test"));
		utenti.add(new Utente("carla", "codegoni", 56, "milano", "cccccc@djhsdjkh", "test"));
		
		return utenti;
	}
	
	
	// prende in ingresso una lista di untenti e un predicato
	public List<Utente> cercaUtenti(List<Utente> utenti, Predicate<Utente> p) {
		//nuova lista utentiTrovati contiene gli elementi che matchano con il criterio di ricerca passato con il predicato(è un filtro!!)
		List<Utente> utentiTrovati = new ArrayList<Utente>();
		
		for (Utente u : utenti) {
			if(p.test(u)) {
				utentiTrovati.add(u);
			}
		}
		return utentiTrovati;
		
	}
}
