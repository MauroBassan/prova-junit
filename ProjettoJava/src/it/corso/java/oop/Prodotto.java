package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Prodotto {
	private int id;
	private String nome;
	private String descrizione;
	private double prezzo;
	//le variabili final possono essere public
	public static final String TIPO_PRODOTTO = "GENERICO";
	
	
	public Prodotto() {
		super();
	}


	/*
	 * creo un costruttore con param in ingresso
	public Prodotto (int id, String nome, double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
	}
	*
	* ma avendo modificato il nome in setNome allora creo il costruttore come segue:
	*/
	
	public Prodotto (int id, String nome, double prezzo) {
		super();

		setId(id);
		setNome(nome);
		setPrezzo(prezzo);
		// usando i set nel costruttore ci garantisce che tutte le modifiche che facciamo nei set vengano mantenute!!! 
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		String tmp = nome.concat("...");
		this.nome = tmp;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		if(prezzo == 0) {
			prezzo = 1;
			//se 0 voglio che il prezzo sia 1 di default
		}
		this.prezzo = prezzo;
	}
	
	public List<String> getStores() {
		/* recupera l'intera lista degli stores */
		ArrayList<String> tmp = new  ArrayList<String>();
		
		tmp.add("Negozio1");
		tmp.add("Negozio2");
		tmp.add("Negozio3");
		tmp.add("Negozio4");
		
		return tmp;		
	}
	
	protected void sincronizza() {
		//..
	}
	
	private void stampa() {
		//..
	}
}
