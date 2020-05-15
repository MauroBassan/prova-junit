package it.corso.java.filesIO;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		
		TestFile tf = new TestFile();
		String dir = "C:\\Users\\Utente\\eclipse-workspace\\ProjettoJava\\test-dir";
		String file = dir+"\\test_file.txt";
		
		tf.creaDir("C:\\Users\\Utente\\eclipse-workspace\\ProjettoJava\\test-dir");
		tf.creaFile(file);
		
		// creiamo istanza di File x la dir
		File f1 = new File(dir);
		
		System.out.println(f1.isDirectory());
		
		// creiamo istanza di File x il file.txt
		File f2 = new File(file);
		System.out.println(f2.isFile());
		
		//creo un array di tipo File dove andro ad mettere tutti gli elementi che trovo nell'istanza f1
		File[] files = f1.listFiles();
		
		for(File f : files) {
			System.out.println(f.getName());
		}

	}
	
	public void creaFile(String path) {
		File f = new File(path);
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void creaDir(String path) {
		
		File f1 = new File(path);
		
		if(!f1.exists()) {
			f1.mkdir();
		}
		
	}

}
