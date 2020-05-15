package it.corso.java.threading.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class EsempioArrayBlockingQueue {

	public static void main(String[] args) {
		// creo una coda che può contenere al massimo 10 elementi
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);
		
		// Producer e Consumer accedono alla stessa coda...
		Thread prod = new Thread(new Producer(queue));
		Thread cons = new Thread(new Consumer(queue));
		
		prod.start();
		cons.start();
		}
	}
