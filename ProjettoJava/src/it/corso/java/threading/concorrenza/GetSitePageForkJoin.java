package it.corso.java.threading.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.RecursiveTask;

import it.corso.java.Utils;

public class GetSitePageForkJoin extends RecursiveTask<String>{

	private String url;
	
	
	public GetSitePageForkJoin(String url) {
		super();
		this.url = url;
	}


	@Override
	protected String compute() {
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

}
