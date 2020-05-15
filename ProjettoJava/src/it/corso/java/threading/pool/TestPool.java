package it.corso.java.threading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {

	public static void main(String[] args) {
		/* creo il thread pool */
		ExecutorService pool = Executors.newCachedThreadPool();
		
		/* aggiunge i thread al pool */
		pool.execute(new GetSitePage("http://www.apple.it"));
		pool.execute(new GetSitePage("http://www.amazon.it"));
	
		pool.shutdown();
		
		ExecutorService threadpool = Executors.newCachedThreadPool();
		
		/* metto in coda i thread */
		threadpool.execute(new GetSitePage("http://www.qclubmilano.com"));
		threadpool.execute(new GetSitePage("http://www.qclubmilano.com"));
		
		/* spengo il thread */
		threadpool.shutdown();
		
		/* 
		 * se proviamo ad aggiungere un nuovo thread dopo aver invokato il metodo shutdown
		 * riceveremo una RejectedExecutionException
		 */
	}

}
