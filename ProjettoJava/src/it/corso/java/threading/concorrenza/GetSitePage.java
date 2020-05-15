package it.corso.java.threading.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

import it.corso.java.Utils;

public class GetSitePage extends Thread {

	private String url;
	//creiamo la var content che conterrà l'output della url
	private String content;
	
	
	public GetSitePage(String url) {
		super();
		this.url = url;
	}

	

	@Override
	public void run() {
		/*il metodo run() ritorna void e non accetta paramentri 
		 * in ingresso quindi ne implementiamo la logica, che è
		 * invocare una url e recuperare informazioni
		 */
		try {
			
			URL u = new URL(url);
			
			URLConnection conn = u.openConnection();
			//recuperiamo la pagina
			InputStream is = conn.getInputStream();
			//scrivaimo quello che c e nella pagina
			setContent(Utils.getString(is));
			
				
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}



	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}



	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}



	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}



	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	
}
