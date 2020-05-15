package it.corso.java.threading.semaforizzazione;

import java.util.List;

public class Producer implements Runnable {

	private final List<Integer> bufferCondiviso;
	private final int SIZE;
	private int i = 1;
	
	
	public Producer(List<Integer> bufferCondiviso, int sIZE) {
		this.bufferCondiviso = bufferCondiviso;
		SIZE = sIZE;
	}
	

	@Override
	public void run() {
		while(true) {
			try {
			produce();
			i++;
			
			Thread.sleep(1000);
			} catch (InterruptedException ex) {
				
				ex.printStackTrace();
			}
		}
	}
	
	private void produce() throws InterruptedException {
		//il thread resta in stato wait se il buffer è pieno
		while (bufferCondiviso.size() == SIZE) {
			synchronized (bufferCondiviso) {
				System.out.println("il BUFFER è pieno, il thread PRODUCER resta in attesa... la dimensione del buffer è: " + bufferCondiviso.size());
				
				bufferCondiviso.wait();
			}
		}
	
	// se il buffer non è pieno, il thread può aggiungere un nuovo elemento e notificarlo al consumer
		synchronized (bufferCondiviso) {
			bufferCondiviso.add(i);
			bufferCondiviso.notifyAll();
			
			System.out.println("il PRODUCER ha aggiunto al BUFFER l'elemento: " + i +" la dimensione del buffer è: " + bufferCondiviso.size());
		}
	}

}
