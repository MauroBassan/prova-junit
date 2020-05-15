package it.corso.java.classiinnerlocali;

import java.util.ArrayList;
import java.util.List;

public class Appartamento {
	private int piano;
	
	private List<StanzaStd> stanzeSt;
	private List<StanzaInner> stanzeIn;
	
	// creo questo metodo x poter istanziare la classe Inner fuori dalla classe apaprtamento, vedi classe Test
	public void aggiungiStanza(double mq, String accessori) {
		/* esempio di classe locale, non è visibile fuori dal metodo aggiungiStanza()! 
		 * basta provare a creare un attributo di tipo calcolaPerimetro per la classe Appartamento, vedremo che 
		 * Eclipse non riconosce la classe che cerchiamo di inizializzare.
		 * */
		class CalcolaPerimetro {
			public double calcola(double lato1, double lato2) {
				return lato1 + lato2;
			}
		}
		
		CalcolaPerimetro cp = new CalcolaPerimetro();
		cp.calcola(10, 10);
		
		getStanzeIn().add(new StanzaInner(mq, accessori));
	}
	
	/* StanzaInner non è istanziabile fuori Appartmento, ma potrei definirla static!
	 * static class StanzaInner { ... } 
	 * */
	
	class StanzaInner {
		private double mq;
		private String accessori;
	
	
		public StanzaInner(double mq, String accessori) {
			super();
			this.mq = mq;
			this.accessori = accessori;
		}

		/**
		 * @return the mq
		 */
		public double getMq() {
			return mq;
		}

		/**
		 * @param mq the mq to set
		 */
		public void setMq(double mq) {
			this.mq = mq;
		}

		/**
		 * @return the accessori
		 */
		public String getAccessori() {
			return accessori;
		}

		/**
		 * @param accessori the accessori to set
		 */
		public void setAccessori(String accessori) {
			this.accessori = accessori;
		}
		
			
	}



	/**
	 * @return the piano
	 */
	public int getPiano() {
		return piano;
	}



	/**
	 * @param piano the piano to set
	 */
	public void setPiano(int piano) {
		this.piano = piano;
	}



	/**
	 * @return the stanzeSt
	 */
	public List<StanzaStd> getStanzeSt() {
		if (stanzeSt == null) {
			stanzeSt = new ArrayList<StanzaStd>();
		}
		return stanzeSt;
	}



	/**
	 * @param stanzeSt the stanzeSt to set
	 */
	public void setStanzeSt(List<StanzaStd> stanzeSt) {
		this.stanzeSt = stanzeSt;
	}



	/**
	 * @return the stanzeIn
	 */
	public List<StanzaInner> getStanzeIn() {
		if (stanzeIn == null) {
			stanzeIn = new ArrayList<StanzaInner>();
		}
		return stanzeIn;
	}



	/**
	 * @param stanzeIn the stanzeIn to set
	 */
	public void setStanzeIn(List<StanzaInner> stanzeIn) {
		this.stanzeIn = stanzeIn;
	}

}
