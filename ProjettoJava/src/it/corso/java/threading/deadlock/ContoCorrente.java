package it.corso.java.threading.deadlock;

/**
 * Si ha il deadlock perchè:
 * 	- il thread t1 aspetta che il thread t2 rilasci il lock sul conto2
 * 	- il thread t2 aspetta che il thread t1 rilasci il lock sul conto1
 * 
 * @author Mro
 *
 */
public class ContoCorrente {

	private double saldo;
	private int id;

	public ContoCorrente(double saldo, int id) {

		setSaldo(saldo);
		setId(id);
	}

	public void preleva(double importo) {
		try {
			Thread.sleep(4000); /* metto il thread in attesa x simulare l'accesso al db x il prelievo*/
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Prelevo " + importo + " dal conto " + getId());
		setSaldo(getSaldo() - importo);
	}

	public void versa(double importo) {
		try {
			Thread.sleep(4000); /* metto il thread in attesa x simulare l'accesso al db x il versamento*/
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Verso " + importo + " sul conto " + getId());
		setSaldo(getSaldo() + importo);
	}

	public static void trasferisci(ContoCorrente da, ContoCorrente a, double importo) {
		System.out.println("Trasferisco denaro dal conto: " + da.id + " al conto: " + a.id);
		// il programma andra in stallo , si verifica il deadlock
		synchronized (da) {
			System.out.println("Avvio prelievo da: " + da.id);
			da.preleva(importo);

			synchronized (a) {
				System.out.println("Avvio prelievo da: " + da.id);
				a.versa(importo); 
			}
		}
	}
	
	public static void main (String[] args) {
		final ContoCorrente conto1 = new ContoCorrente(3500, 1);
		final ContoCorrente conto2 = new ContoCorrente(10000, 2);
		
		Thread t1 = new Thread() {
			public void run() {
				ContoCorrente.trasferisci(conto2, conto1, 2000);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				ContoCorrente.trasferisci(conto1, conto2, 500);
			}
		};
		
		t1.start();
		t2.start();
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}




}
