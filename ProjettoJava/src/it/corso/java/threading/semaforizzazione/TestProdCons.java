package it.corso.java.threading.semaforizzazione;

import java.util.LinkedList;
import java.util.List;

public class TestProdCons {

	public static void main(String[] args) {
		List<Integer> bufferCondiviso = new LinkedList<Integer>();
		int size = 4;
		
		Thread prodT = new Thread( new Producer(bufferCondiviso, size), "Producer");
		Thread consT = new Thread( new Consumer(bufferCondiviso, size), "Consumer");
		
		prodT.start();
		consT.start();
	}

}
