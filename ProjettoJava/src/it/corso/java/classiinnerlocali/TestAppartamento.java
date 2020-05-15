package it.corso.java.classiinnerlocali;

import java.util.List;

import it.corso.java.classiinnerlocali.Appartamento.StanzaInner;

public class TestAppartamento {

	public static void main(String[] args) {
		Appartamento a = new Appartamento();
		
		a.setPiano(0);
		a.getStanzeSt().add(new StanzaStd(20, "Queen"));
		/* non potremmo istanziare una classe inner di appartamento, ovvero fuori dalla classe dove è definita, ma aggiriamo il problema
		 * a.getStanzeIn().add(new StanzaInner(25,	"King"));
		 * aggiro il problema richiamando il metodo che prende getStanzeIn
		 */
		a.aggiungiStanza(25, "King");
		
		/* oppure se stanzaInner l'ho dichiarata static:
		 * 
		 * StanzaInner si = new Appartament.StanzaInner(mq, accessori);
		 */
		
		
		List<StanzaStd> st = a.getStanzeSt();
		
		for (StanzaStd s : st) {
			System.out.println(s.getMq());
		}
		
		List<StanzaInner> st2 = a.getStanzeIn();
		//la classe inner si riesce a usare in lettura
		for(StanzaInner s : st2) {
			System.out.println(s.getMq());
		}
	}

}
