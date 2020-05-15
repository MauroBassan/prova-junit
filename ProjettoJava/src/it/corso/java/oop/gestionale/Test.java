package it.corso.java.oop.gestionale;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		OrdineDiVendita odv = new OrdineDiVendita();
		
		odv.setCliente(new Cliente());
		odv.setDataOrdine(new Date());
		odv.setStatoOrdine(OrdineDiVendita.STATO_SPEDITO );
		odv.setRigheOrdine(new ArrayList<RigaOrdine>());
		
		odv.getCliente().setCodiceFiscale("BSSMRA82M11A940M");
		odv.getCliente().setCognome("Bassan");
		odv.getCliente().setNome("Mauro");
		
		Smartphone sm1 = new Smartphone();
		sm1.setMarca("apple");
		sm1.setModello("iphone");
		sm1.setPrezzo(800);
		
		Televisore tv1 = new Televisore();
		tv1.setMarca("loewe");
		tv1.setModello("smart tv");
		tv1.setPrezzo(1000);
		
		RigaOrdine rg1 = new RigaOrdine(1, sm1, 1, sm1.getPrezzo());
		RigaOrdine rg2 = new RigaOrdine(2, tv1, 1, tv1.getPrezzo());
		odv.getRigheOrdine().add(rg1);
		odv.getRigheOrdine().add(rg2);
		
		
		
	}

}
