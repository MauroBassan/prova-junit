package it.corso.java.classianonime;

public class TestClassiAnonime {

	public static void main(String[] args) {
		TestClassiAnonime test = new TestClassiAnonime();
		
		Azione a1 = test.eseguiAzione();
		a1.eseguiAzione();
		
		Azione a2 = test.eseguiAzione2();
		a2.eseguiAzione();

	}

	public Azione eseguiAzione() {
		return new AzioneImpl();
	}
	
	//creo la classe anonima
	public Azione eseguiAzione2() {
		return new Azione() {

			@Override
			public void eseguiAzione() {
				System.out.println("sono nella classe anonima");
				
			}
			
		};
	}
}
