package it.corso.java.filesIO;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		leggi2();

	}

	public static void leggi2() {
		System.out.println("Benvenuto nel programma...");
		
		String saluto = "ciao ";
		
		System.out.println("Inserire nome: ");
		
		Scanner sc = new Scanner(System.in);
		String risposta = sc.nextLine();
		saluto += risposta;
		
		sc.close();
		
		System.out.println(saluto);
	}
}
