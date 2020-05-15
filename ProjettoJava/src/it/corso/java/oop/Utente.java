package it.corso.java.oop;

public class Utente {
	
	private long id;
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String email;
	
	/* dichiarazione       = inizializzazione
	 * (dichiaro)File f			= (inizialiazzo) new File();
	 * quando definisco una istanza o una variabile, riservo soltanto un'area di memoria, quando
	 * il costruttore inizializza gli oggetti automaticamente, crea una istanza quindi una variabile, 
	 * ovvero assegna (alloca)  una parte di memoria ad una istanza 
	 * */
	
	//costruttore default, senza params:
	public Utente () {
		super();
	}
	
	// creo il costruttore che accetta 2 params in ingresso:
	public Utente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	/* in java non esiste il distruttore ma il Garbage Collector, che è un
	 * meccanismo automatico che distrugge gli oggetti non utilizzati presenti in memoria
	 * */
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
