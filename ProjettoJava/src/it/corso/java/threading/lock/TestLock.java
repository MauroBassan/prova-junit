package it.corso.java.threading.lock;

public class TestLock {

	public static void main(String[] args) {
		ReentrantLockEsempio counter = new ReentrantLockEsempio();
		
		Contatore c1 = new Contatore(counter, 10, 50);
		Contatore c2 = new Contatore(counter, 10, 50);
		
		c1.start();
		c2.start();
	}

}
