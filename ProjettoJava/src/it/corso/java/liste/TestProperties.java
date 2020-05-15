package it.corso.java.liste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		TestProperties tp = new TestProperties();
		
		tp.getConfig();

	}
	// creiamo un metodo che legga la configurazione di un file
	public void getConfig() {
		//per fare cio esiste la classe Properties
		Properties p = new Properties();
		InputStream is;
		try {
			is = new FileInputStream(new File("C:\\Users\\Utente\\eclipse-workspace\\ProjettoJava\\config.properties"));
			
			p.load(is);
			
			/*
			 * db-name=progetto
				db-address=127.0.0.1
				db-user=root
				db-password=test
			 */
			
			System.out.println(p.getProperty("db-name"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// per caricare il file esiste il metodo load() che prende in ingresso una classe di tipo InputStream
	}
}
