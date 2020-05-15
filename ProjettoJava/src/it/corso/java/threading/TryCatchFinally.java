package it.corso.java.threading;

public class TryCatchFinally extends Thread {
	private long sleep;

	public TryCatchFinally(long sleep) {
		super();
		this.sleep = sleep;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Entrato nel FINALLY");
		}
	}
	
	
	

}
