package it.corso.java.threading;

public class TestThread {

	public static void main(String[] args) {
		Threading t = new Threading();
		t.start(); // con questo metodo viene invocato il metodo run!
		// uso l'interfacci Runnable quando sto già estendendo una classe, java non supportà eredità multipla 
		Thread th = new Thread(new EsempioRunnable());
		th.start();

	}

}
