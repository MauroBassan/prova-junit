package it.corso.java.cicli;

public class BreakContinue {
	
	public void esempioBreak(int interruttore, int estremo) {
		
		for (int i = 0; i < estremo; i++) {
			//inserisco il controllo!!
			if(i == interruttore) {
				System.out.println("i == interruttore!!!");
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("esco dal ciclo al break! \n -----------------------");
	}

	public void esempioContinue(int interruttore, int estremo) {
		
		for (int i = 1; i < estremo; i++) {
			//inserisco il controllo!!
			if(i % 2 == 0) {
				System.out.println("i == pari: " +i);
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("eseguito il ciclo continue!");
	}
}
