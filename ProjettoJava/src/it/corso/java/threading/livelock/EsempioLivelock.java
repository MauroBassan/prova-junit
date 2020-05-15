package it.corso.java.threading.livelock;

public class EsempioLivelock implements Runnable {
	private Persona ragazzo1;
	private Persona ragazzo2;
	
	public EsempioLivelock(Persona ragazzo1, Persona ragazzo2) {
		super();
		this.setRagazzo1(ragazzo1);
		this.setRagazzo2(ragazzo2);
	}

	public static void main(String[] args) {
		EsempioLivelock p1 = new EsempioLivelock(new Persona("mauro"), new Persona("luigi"));
		EsempioLivelock p2 = new EsempioLivelock(new Persona("mirko"), new Persona("nicola"));
		
		new Thread(p1).start();
		new Thread(p2).start();
	}

	@Override
	public void run() {
		getRagazzo1().saluta(getRagazzo2());
		
	}
	
	public Persona getRagazzo1() {
		return ragazzo1;
	}


	public Persona getRagazzo2() {
		return ragazzo2;
	}

	
	private void setRagazzo1(Persona ragazzo1) {
		this.ragazzo1 = ragazzo1;
		
	}
	
	private void setRagazzo2(Persona ragazzo2) {
		this.ragazzo2 = ragazzo2;
	}


}
