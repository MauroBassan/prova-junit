package it.corso.java.filesIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestScrittura {

	public static void main(String[] args) {
		String dir = "C:\\Users\\Utente\\eclipse-workspace\\ProjettoJava\\test-dir";

		TestScrittura ts = new TestScrittura();
		ts.esempioFileWriter(dir+"\\file-writer.txt", "lorem ipsum...");
		
		ts.esempioBufferedFileWriter(dir+"\\buffered-writer.txt",
				new String [] {"Mro", "Bsn", "corso java","avanzato!"});

	}

	public void esempioFileWriter(String filePath, String testo) {


		// a questo punto siamo sicuri che il file sia stato creato
		FileWriter fw = null; 
		try {
			fw = new FileWriter(getFile(filePath));
			fw.write(testo);
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public void esempioBufferedFileWriter(String filePath, String[] testo) {
		/* è ridondante quindi creo direttamente il metodo creaFile
		 * 
		 */
		//		File f = new File(filePath);
		//		
		//		if(!f.exists()) {
		//			try {
		//				f.createNewFile();
		//			} catch (IOException e) {
		//				
		//				e.printStackTrace();
		//			}
		//		}
		// a questo punto siamo sicuri che il file sia stato creato
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(getFile(filePath)));
			//creo ciclo foreach x inserire più stringhe
			for (String string : testo) {
				bw.write(string);
				bw.newLine();
			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public void esempioPrintWriter(String filePath, String testo) {


		// a questo punto siamo sicuri che il file sia stato creato
		PrintWriter pw = null; 
		try {
			pw = new PrintWriter(new FileWriter(getFile(filePath)));
			pw.write(testo);
			pw.println();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			pw.close();
		}

	}
	
	private File getFile(String filePath) {

		File f = new File(filePath);

		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return f;

	}
}
