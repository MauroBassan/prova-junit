package it.corso.java.threading;

public class Threading extends Thread {

	@Override
	public void run() {
		System.out.println("sono un thread!");
		super.run();
	}
	
	

}
