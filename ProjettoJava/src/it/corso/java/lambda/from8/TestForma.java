package it.corso.java.lambda.from8;

public class TestForma {

	public static void main(String[] args) {
	
		FormaGeometrica Rettangolo = (a, b) -> a*b;
		System.out.println(Rettangolo.calcolaArea(10, 5));
		
		FormaGeometrica Quadrato = (a, b) -> a * b;
		System.out.println(Quadrato.calcolaArea(5, 5));
		
		/* nel caso seguente, essendoci un solo param in ingeesso, come definito nell'interfaccia, 
		 * potri omettere le parentesi:
		 *  ...... = testo -> testo.toUpperCase();
		 */
		StampaMaiuscolo Stampa = (testo) -> testo.toUpperCase();
		System.out.println(Stampa.stampaMaiuscolo("ciao"));
	}

}
