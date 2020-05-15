package it.corso.java.filesIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputDaTastiera {

	public static void main(String[] args) {
		leggi1();

	}

	public static void leggi1() {
		System.out.println("Benvenuto nel programma!");
		String saluto = "ciao ";
		
		try {
			
		System.out.println("Inserisci nome:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		saluto += br.readLine();
		
		System.out.println(saluto);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
