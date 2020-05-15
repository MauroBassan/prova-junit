package it.corso.java;

import java.util.ArrayList;
import java.util.Date;

public class ArticoloGiornale {
	private long id;
	private String titolo;
	private String abstract_;
	private String testo;
	private String autore;
	private Date dataCreazione;
	private Date dataPubblicazione;
	
	
	public ArticoloGiornale(long id, String titolo, String abstract_, String testo, String autore, Date dataCreazione,
			Date dataPubblicazione) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.abstract_ = abstract_;
		this.testo = testo;
		this.autore = autore;
		this.dataCreazione = dataCreazione;
		this.dataPubblicazione = dataPubblicazione;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}


	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	/**
	 * @return the abstract_
	 */
	public String getAbstract_() {
		return abstract_;
	}


	/**
	 * @param abstract_ the abstract_ to set
	 */
	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}


	/**
	 * @return the testo
	 */
	public String getTesto() {
		return testo;
	}


	/**
	 * @param testo the testo to set
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}


	/**
	 * @return the autore
	 */
	public String getAutore() {
		return autore;
	}


	/**
	 * @param autore the autore to set
	 */
	public void setAutore(String autore) {
		this.autore = autore;
	}


	/**
	 * @return the dataCreazione
	 */
	public Date getDataCreazione() {
		return dataCreazione;
	}


	/**
	 * @param dataCreazione the dataCreazione to set
	 */
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}


	/**
	 * @return the dataPubblicazione
	 */
	public Date getDataPubblicazione() {
		return dataPubblicazione;
	}


	/**
	 * @param dataPubblicazione the dataPubblicazione to set
	 */
	public void setDataPubblicazione(Date dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}
	
	
	public int contaCaratteri() {
		int[] caratteri = new int[this.getTesto().length()];
		
		int total = 0;
		
		for (int i = 0; i < caratteri.length; i++) 	
			total ++;
			
			return total;	
		}
		
	public int conta() {
		if(getTesto() != null) {
			return getTesto().length();
		}
		return 0;
	}
	
	private static boolean isPalindrome(String word) {
		int n = word.length();
		word.toLowerCase();
		for (int i = 0; i < n; i++) {
			if(word.charAt(i) != word.charAt(n -1))
				return false;		
		}		
		return true;
	}
	
	public int contaPalindrome() {
		if(this.getTesto() != null) {
			int contatore = 0;
			String [] testo = this.getTesto().split(" ");
			
			for (String string : testo) {
				if(isPalindrome(string)) {
					contatore++;
				}
			}
			return contatore;
		}
		return 0;
	}
	
	
	
}
