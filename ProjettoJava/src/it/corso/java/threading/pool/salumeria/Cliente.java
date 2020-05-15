package it.corso.java.threading.pool.salumeria;

import java.util.Random;

public class Cliente implements Runnable {
	
	private int numeroTicket;
	
	
	public Cliente(int numeroTicket) {
		System.out.println("E' arrivato un nuovo cliente e ha preso il numero: " + numeroTicket);
		this.numeroTicket = numeroTicket;
	}
	

	@Override
	public void run() {
		// il cliente ordina i prodotti al dipendente presente al bancone
		richiediProdotti();
	}
	
	private void richiediProdotti() {
		System.out.println("Serviamo il cliente numero: " + numeroTicket);
		
		// imposto durata random per ciascun cliente
		Random r = new Random();
		
		// ipotizzo che un cliente impieghi dai 5 ai 20 secondi x l'acquisto
		int tempoImpiegatoPerAcquisto = (r.nextInt(15) + 5)*1000;
		
		try {
			Thread.sleep(tempoImpiegatoPerAcquisto);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Il cliente che aveva il numero " + numeroTicket + " ha completato il suo acquisto in " + tempoImpiegatoPerAcquisto/1000 + " secondi");
	}

}
