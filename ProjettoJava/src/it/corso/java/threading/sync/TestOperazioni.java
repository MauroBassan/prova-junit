package it.corso.java.threading.sync;

public class TestOperazioni {

	public static void main(String[] args) throws InterruptedException {
		Cliente c1 = new Cliente("Mro", 35);
		Cliente c2 = new Cliente("Lgi", 25);
		
		// Avvio i Threads
		c1.start();
		c2.start();
		
		// attendo il completamento
		c1.join();
		c2.join();

		
		/*************************/
		
//		ClienteNonSync c3 = new ClienteNonSync("Mro", 10);
//		ClienteNonSync c4 = new ClienteNonSync("Lgi", 10);
//		
//		// Avvio i Threads
//		c3.start();
//		c4.start();
//				
//		// attendo il completamento
//		c3.join();
//		c4.join();
//		
	}

}
