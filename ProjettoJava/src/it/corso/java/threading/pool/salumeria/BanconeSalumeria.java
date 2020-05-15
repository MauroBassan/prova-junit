package it.corso.java.threading.pool.salumeria;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BanconeSalumeria {

	private final static int CLIENTI_DA_SERVIRE = 30;
	private final int DIPENDENTI_AL_BANCONE = 3;

	private BlockingQueue<Runnable> codaBancone = new ArrayBlockingQueue<Runnable>(30, true);
	/* crea un threadpool di 3 elementi*/
	private ExecutorService dipendentiDisponibili = Executors.newFixedThreadPool(DIPENDENTI_AL_BANCONE);

	public static void main (String[] args) {

		System.out.println("Nel supermercato ci sono " + CLIENTI_DA_SERVIRE + " clienti che stanno andando al bancone salumeria...");

		BanconeSalumeria bancone = new BanconeSalumeria();
		bancone.arrivoClientiAlBancone();
		// dopo che sono stati aggiunti i thread inizia il servizio clienti
		bancone.servizioClienti();


	}
	/*metodo che itera CLIENTI_DA_SERVIRE e aggiunge alla coda una istanza della classe cliente, 
	 * quindi un nuovo thread, così avremo 30 thread in coda
	 * */
	private void arrivoClientiAlBancone() {
		for(int i = 1; i <= CLIENTI_DA_SERVIRE; i++) {
			/*il cliente viene inserito in coda */
			try {
				codaBancone.put(new Cliente(i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void servizioClienti() {
		new Thread(new Runnable() {
			public void run() {
				while(true) {
					try {
						/* da questo momento in poi il primo cliente disponibile viene servito*/
						dipendentiDisponibili.execute(codaBancone.take());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}).start();
	}
}
