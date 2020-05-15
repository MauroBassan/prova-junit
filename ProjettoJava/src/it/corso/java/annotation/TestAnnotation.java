package it.corso.java.annotation;

public class TestAnnotation {
	
	// con questa annotation eleimino il warning, ovvero il triangolino giallo di fianco al metodo
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	Prodotto p = new Prodotto();
	
	p.setPrezzo(400);
	double iva = p.calcolaIva(22);
	
	System.out.println(iva);
	
	}
}
