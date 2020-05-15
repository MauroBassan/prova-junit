package it.corso.java.threading.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

import it.corso.java.Utils;

public class GetSitePageExecutor implements Callable<String> {

	private String url;
	//creiamo la var content che conterrà l'output della url
	private String content;



	public GetSitePageExecutor(String url) {
		super();
		this.url = url;
	}


	@Override
	public String call() throws Exception {
		try {

			URL u = new URL(url);

			URLConnection conn = u.openConnection();
			//recuperiamo la pagina
			InputStream is = conn.getInputStream();
			//scrivaimo quello che c e nella pagina
			return Utils.getString(is);


		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return null;
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
