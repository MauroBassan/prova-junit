package it.corso.java.lambda;

public class Utente {
	private String nome;
	private String cognome;
	private int et�;
	private String cittaResidenza;
	private String email;
	private String password;
	
	
	public Utente(String nome, String cognome, int et�, String cittaResidenza, String email, String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.et� = et�;
		this.cittaResidenza = cittaResidenza;
		this.email = email;
		this.password = password;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}


	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	/**
	 * @return the et�
	 */
	public int getEt�() {
		return et�;
	}


	/**
	 * @param et� the et� to set
	 */
	public void setEt�(int et�) {
		this.et� = et�;
	}


	/**
	 * @return the cittaResidenza
	 */
	public String getCittaResidenza() {
		return cittaResidenza;
	}


	/**
	 * @param cittaResidenza the cittaResidenza to set
	 */
	public void setCittaResidenza(String cittaResidenza) {
		this.cittaResidenza = cittaResidenza;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
