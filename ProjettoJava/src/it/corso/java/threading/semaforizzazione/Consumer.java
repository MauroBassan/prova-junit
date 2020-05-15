package it.corso.java.threading.semaforizzazione;

import java.util.List;

public class Consumer implements Runnable {
	private final List<Integer> bufferCondiviso;
	
	
	public Consumer(List<Integer> bufferCondiviso, int size) {
		this.bufferCondiviso = bufferCondiviso;
	}


	@Override
	public void run() {
		while(true) {
			try {
			System.out.println("CONSUMER sta leggendo il buffer...");
			
				consume();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		//il thread resta in stato wait se il buffer è vuoto
				while (bufferCondiviso.isEmpty()) {
					synchronized (bufferCondiviso) {
						System.out.println("il BUFFER è vuoto, il thread CONSUMER resta in attesa... la dimensione del buffer è: " + bufferCondiviso.size());
						
						bufferCondiviso.wait();
					}
				}
			
			// se il buffer non è vuoto, il thread può eliminarne uno  e notificarlo al producer
				synchronized (bufferCondiviso) {
					System.out.println("il CONSUMER legge il buffer ed elimina l'elemento: " + bufferCondiviso.remove(0) +" la dimensione del buffer è: " + bufferCondiviso.size());
					
					bufferCondiviso.notifyAll();
					
				}
			}

		}
