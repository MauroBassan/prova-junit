package it.corso.java.threading.starvation;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * questa classe conta semplicemente fino a 50
 *
 */
public class Avanzamento extends Thread {
	private JLabel label;
	private String risorsaRicorsiva;
	
	public Avanzamento(String risorsaRicorsiva, String nomeBarra) {
		this.risorsaRicorsiva = risorsaRicorsiva;
		this.setName(nomeBarra);
		
		label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
	}

	public JLabel conta() {
		return label;
	}
	
	@Override
	public void run() {
		int contatore = 0;
		
		while(true) {
			synchronized (risorsaRicorsiva) {
				if (contatore == 50) {
					contatore = 0;
				}
				
				label.setText(" - " + this.getName() + ": " + ++contatore + " -");
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
