package it.corso.java.condizionali;

public class TestCondizionali {

	public static void main(String[] args) {
		
		IfElseSwitch test = new IfElseSwitch();
		
		int x = test.trovaMaggiore(35, 20, 50);
		
		System.out.println(x);
		
		System.out.println(test.isNull("ciao"));
		
		System.out.println(IfElseSwitch.getInstance().isNull("pancho"));
		
		System.out.println(IfElseSwitch.getInstance().recuperaTesto(8));
		
	}

}
