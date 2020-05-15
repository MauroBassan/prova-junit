package it.corso.java.threading.queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	private BlockingQueue<String> queue;
	
	
	
	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}



	@Override
	public void run() {
		while(true) {
			// se è possibile aggiungere nuovi elementi...
			if(queue.remainingCapacity() > 0) {
				// stampa questa frase
				System.out.println("E' possibile aggiungere ancora " + queue.remainingCapacity() + " su " + queue.size());
			//altrimenti elimina un elemento
			} else if ( queue.remainingCapacity() == 0) {
				String elementoRimosso = queue.remove();
				System.out.println("E' stato rimosso l'elemento: " + elementoRimosso);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}