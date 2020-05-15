package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

// eredito con extends tutti gli attributi e prop public o protected
public class Libro extends Prodotto {
	
	private String serialNumber;
	private String autore;
	private String editore;
	private int anno;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	@Override
	public List<String> getStores() {
		ArrayList<String> tmp = new  ArrayList<String>();
		
		tmp.add("Negozio3");
		tmp.add("Negozio4");
		
		return tmp;
	}
	
	
}
