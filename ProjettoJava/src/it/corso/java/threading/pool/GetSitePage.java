package it.corso.java.threading.pool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.InflaterInputStream;

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
			// IMPLEMENTO IL METODO X EFFETTUARE LA CHIAMATA ALLA URL
			URL site = new URL(url);

			URLConnection conn = site.openConnection();
			//recuperiamo la pagina
			InputStream in = conn.getInputStream();

			String encoding = conn.getContentEncoding();

			encoding = encoding == null ? "UTF-8" : encoding;
			//scrivaimo quello che c e nella pagina
			//setContent(Utils.getString(is));

			System.out.println("******************************");
			System.out.println("CONTENUTO DELLA PAGINA WEB: " + url);
			System.out.println(getString(in));
			System.out.println("******************************");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private String getString(InputStream is) {

		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();

		String line;
		try {
			br = new BufferedReader(new InputStreamReader(is));

			while ( ( line = br.readLine()) != null) {
				sb.append(line);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
	
	public String getContent() {
		return content;
	} 
}