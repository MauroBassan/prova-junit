package it.corso.java.filesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLettura {

	public static void main(String[] args) {
		
		String dir = "C:\\Users\\Utente\\eclipse-workspace\\ProjettoJava\\test-dir";
		
		TestLettura tl = new TestLettura();

		tl.esempioFileReader(dir+"\\file-writer.txt");
		
		System.out.println("\n----------------------");
		
		tl.esempioFileReader(dir+"\\lettura.txt");
		
	}

	public void esempioFileReader(String filePath)  {

		File f = new File(filePath);

		if(f.exists()) {
			FileReader fr = null;
			try {
				fr = new FileReader(f);

				char[] testo = new char[1024];

				int size = fr.read(testo);

				for ( int i = 0; i < size; i++ ) {
					System.out.print(testo[i]);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	public void esempioBufferedReader(String filePath)  {

		File f = new File(filePath);

		if(f.exists()) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));

				char[] testo = new char[1024];

				int size = br.read(testo);

				for ( int i = 0; i < size; i++ ) {
					System.out.print(testo[i]);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
}