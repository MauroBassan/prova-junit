package it.corso.java.threading;

public class TestTryCatchFinallyThread {

	public static void main(String[] args) {
		TryCatchFinally t1 = new TryCatchFinally(10);
		
		//avvio il Thread
		t1.start();
		
		//interrompo il Thread
		t1.interrupt();

	}

}
