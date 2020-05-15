package it.corso.java.threading.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EsempioLinkedBQ {

	public static void main(String[] args) {
		// creo una coda che può contenere al massimo 10 elementi
				BlockingQueue<String> queue = new LinkedBlockingQueue<String>();
				
				// Producer e Consumer accedono alla stessa coda...
				Thread prod = new Thread(new Producer(queue));
				Thread cons = new Thread(new Consumer(queue));
				
				prod.start();
				cons.start();
				}
	

}
