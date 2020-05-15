package it.corso.java.threading.queue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	// questa variabile viene inizializzata nel costruttore
	private BlockingQueue<String> queue;
	
	
	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
		int i = 0;
		// finchè non interrompo il software
		while(true) {
			String elem = "Elemento numero " +i;
			
			/* questo thread (PRODUCER) prova ad aggiungere un elemento alla coda 
			 * attraverso l'invokazione del metodo offer() un elemento che in questo caso è la String elem.
			 *  */
			
			boolean aggiunto = queue.offer(elem);
			
			System.out.println("L'elemento " + i + " è stato aggiunto? " + aggiunto);
			
			i++;
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
