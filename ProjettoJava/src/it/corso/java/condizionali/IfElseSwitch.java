package it.corso.java.condizionali;

public class IfElseSwitch {
	
	//proviamo con un pattern Singleton, si usa x utilizzare sempre la stessa istanza di un classe e quindi occupare meno memoria
	private static IfElseSwitch singleton;
	
	public static IfElseSwitch getInstance() {
		if (singleton == null) {
			
			singleton = new IfElseSwitch();
		}
		
		return singleton;
	}
	
	// IF - ELSE
	public int trovaMaggiore (int num1, int num2, int num3) {
		// variabile di istanza
		int maggiore = 0; 
		
		//conditional statement
		if(num1 > num2 && num1 > num3) {
			maggiore = num1;
		} else if(num2 > num1 && num2 > num3) {
			maggiore = num2;
		} else maggiore = num3;
		
		return maggiore;
	}
	// Usando il RETURN, codice molto più snello
	public int trovaMaggiore2 (int num1, int num2, int num3) {
		//conditional statement
		if(num1 > num2 && num1 > num3) {
			return num1;
		} else if(num2 > num1 && num2 > num3) {
			return num2;
		} else return num3;
		
	}
	
	
	
	public boolean isNull(String text) {
		if (text == null) {
			return true;
		}
		return false;
	}
	
	// SWITCH
	/**
	 * 
	 * @param codice i valori ammessi sono 1,2,3
	 * @return
	 */
	public String recuperaTesto(int codice) {
		String testo = null;
		
		switch (codice) {
		case 1:
			testo = "codice 1";				
			break;
		case 2:
			testo = "codice 2";
			break;
		case 3:
			testo = "codice 3";
			break;
		default:
			testo = "inserire valore valido";
			break;
		}
		return testo;
	}
	
}
