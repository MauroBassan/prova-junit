package it.corso.java.threading;

public class EsempioRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("sono un thread runnable!");
	}

}
