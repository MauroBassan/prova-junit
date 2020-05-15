package it.corso.java.oop;

public class Smartphone {
	//incapsulamento, accedere a attributi privati con metodi pubblici ( principio information hiding, ti faccio sapere cosa fa ma non come)
	private String serialNumber;
	private String imei;
	private String marca;
	private String modello;
	//definisco un attibuto schermo di tipo Display (vedi classe display)
	private Display schermo;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	

}
