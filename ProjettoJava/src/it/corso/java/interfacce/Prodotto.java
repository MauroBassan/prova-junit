package it.corso.java.interfacce;

public class Prodotto implements GeneraDati {
	private long id;
	private String nome;
	private String codice;
	private double prezzo;
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	/**
	 * @return the prezzo
	 */
	public double getPrezzo() {
		return prezzo;
	}
	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String generaXML() {
		String xml = 
				"<prodotto>" +
					"<codice>" + getCodice()+ "</codice>" + 
					"<nome>" + getNome()+ "</nome>" +
					"<prezzo>" + getPrezzo() + "</prezzo>" + 
				"</prodotto>";
		return null;
	}
	
	

}
