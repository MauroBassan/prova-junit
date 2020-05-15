package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Televisore extends Prodotto {
	
	private String pollici;
	private String accessori;
	
	public String getPollici() {
		return pollici;
	}
	public void setPollici(String pollici) {
		this.pollici = pollici;
	}
	public String getAccessori() {
		return accessori;
	}
	public void setAccessori(String accessori) {
		this.accessori = accessori;
	}
	
	public void cambiaCanale() {
		//...
	}
	
	public void accendi() {
		//...
	}
	
	//esempi di polimorfismo X OVERRIDE
	@Override
	public List<String> getStores() {
		// creo un arrayList di nome tmp che prende l'elenco degli sotres dalla classe padre
		List<String> tmp = super.getStores();
		//creo una nuova arrayList vuota
		List<String> tmp2 = new ArrayList<String>();
		//ciclo gli elementi in tmp e se verificano le condizioni nel if, allora popolo tmp2 con tmp2.add
		for(String string : tmp ) {
			if(string.contains("2") || string.contains("4")) {
				tmp2.add(string);
			}
		}
		//ritorno il nuovo arrayList
		return tmp2;
	}
	@Override
	protected void sincronizza() {
		// TODO Auto-generated method stub
		super.sincronizza();
	}

	
}
