package it.corso.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EsempioCercaUtenti {

	public static void main(String[] args) {
		EsempioCercaUtenti ecu = new EsempioCercaUtenti();
		
		List<Utente> trovati =  ecu.cercaUtenti(ecu.elencoUtenti(), utente -> utente.getCognome().equals("gabellotti"));
		
		System.out.println("Utenti con cognome Gabellotti:\n**********************");
		for (Utente utente : trovati) {
			System.out.println(utente.getCognome() + " " + utente.getNome());
		}
		System.out.println();
		
		trovati = ecu.cercaUtenti(ecu.elencoUtenti(), utente -> utente.getEmail().contains("a"));
		System.out.println("Utenti con email conteneti la lettera a:\n**********************");
		for (Utente utente2 : trovati) {
			System.out.println(utente2.getCognome() + " " + utente2.getNome());	
		}
		System.out.println();
		
		trovati = ecu.cercaUtenti(ecu.elencoUtenti(), utente -> utente.getEtà() >= 40);
		System.out.println("Utenti con età >0 40:\n**********************");
		for (Utente utente2 : trovati) {
			System.out.println(utente2.getCognome() + " " + utente2.getNome());	
		}
		System.out.println();
		
		trovati = ecu.cercaUtenti(ecu.elencoUtenti(), utente -> utente.getCittaResidenza().equalsIgnoreCase("miami"));
		System.out.println("Utenti con residenza Miami:\n**********************");
		for (Utente utente3 : trovati) {
			if(utente3 != null) {
			System.out.println(utente3.getCognome() + " " + utente3.getNome());	
			}
		}
		System.out.println();
		
		Utente u = ecu.cercaUtente(ecu.elencoUtenti(), utente -> utente.getCittaResidenza().equalsIgnoreCase("miami"));
		System.out.println("Utenti con residenza Miami:\n**********************");
		for (Utente utente3 : trovati) {
			if(utente3 != null) {
			System.out.println(utente3.getCognome() + " " + utente3.getNome());	
			}
		}
		System.out.println();
	}
	
	private List<Utente> elencoUtenti() {
		List<Utente> utenti = new ArrayList<Utente>();
		
		utenti.add(new Utente("mauro", "bassan", 37, "MIAmi", "fdjfh@djhsdjkh", "test"));
		utenti.add(new Utente("luigi", "gabellotti", 30, "miami", "fdjfh@abcabc", "test"));
		utenti.add(new Utente("nicola", "donnantuoni", 42, "milano", "eeeeee@djhsdjkh", "test"));
		utenti.add(new Utente("mirko", "destro", 40, "milano", "aaaaaa@djhsdjkh", "test"));
		utenti.add(new Utente("davide", "surace", 44, "milano", "tttttttt@djhsdjkh", "test"));
		utenti.add(new Utente("carla", "codegoni", 56, "milano", "cccccc@djhsdjkh", "test"));
		
		return utenti;
	}

	
	// prende in ingresso una lista di untenti e un predicato
		public List<Utente> cercaUtenti(List<Utente> elencoUtenti, Predicate<Utente> criterio) {
			//nuova lista utentiTrovati contiene gli elementi che matchano con il criterio di ricerca passato con il predicato(è un filtro!!)
			List<Utente> trovati = new ArrayList<Utente>();
			
			for (Utente utente : elencoUtenti) {
				if(criterio.test(utente)) {
					trovati.add(utente);
				}
			}
			return trovati;
			
		}
		
		public Utente cercaUtente(List<Utente> elencoUtenti, Predicate<Utente> criterio) {
			Utente trovato = null;
			
			for (Utente utente : elencoUtenti) {
				if(criterio.test(utente))
					return utente;
			
		}
			return null;
}
}
