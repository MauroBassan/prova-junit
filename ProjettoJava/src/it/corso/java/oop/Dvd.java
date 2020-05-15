package it.corso.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Dvd extends Prodotto {

		public String serialNumber;

		public String getSerialNumber() {
			return serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}
		
		//polimorfismo: sovrascrivo il metodo della classe prodotto
		@Override
		public List<String> getStores() {
			ArrayList<String> tmp = new  ArrayList<String>();
			
			tmp.add("Negozio1");
			tmp.add("Negozio2");
			
			return tmp;
		}
		
		
}
