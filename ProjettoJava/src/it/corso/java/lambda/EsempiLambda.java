package it.corso.java.lambda;

import java.util.concurrent.Callable;

public class EsempiLambda {

	public static void main(String[] args) {
		Thread t1 = new Thread( ) {

			@Override
			public void run() {
				System.out.println("thread creato senza Lambda Expression");
			}		
		};
		
		Thread t2 = new Thread(() -> System.out.println("Thread creato con Lambda Expression!"));
		
		Thread t3 = new Thread(() -> {
			int count = 0;
//			continue;
			while(true) {
				if (count % 2 == 0) {
					System.out.println("count vale: " + count);
				}
				if(count == 100) {
					break;
				}
				count++;
			}		
		});

		t1.start();
		t2.start();
		t3.start();
		
		Thread t4 = new Thread(() -> {
			System.out.println("sono nel thread 4!");
			
			int max = 0;
			
			while(max < 10) {
				System.out.println("max = " + max);
				
				if (max == 5) {
					break;
				}
			}	
		});
		
		String nome = null;
		String cognome = null;
		
		
	}
	
	private static void saluta(String nome, String cognome) {
		
		Callable<String> callMe = () -> {
			if(nome == null && cognome == null) {
				throw new Exception("il nome e il cognome non sono stati inseriti!");
			} else if (nome == null && cognome != null) {
				throw new Exception("il nome non è stato inserito!");
			} else if (nome != null && cognome == null) {
				throw new Exception("il cognome non è stato inserito!");
			} else {
				return "ciao " + nome +" "+ cognome;
			}
		};
		try {
			callMe.call();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
