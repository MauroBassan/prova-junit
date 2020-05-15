package it.corso.java.oop;

public class TestSmartphone {

	public static void main(String[] args) {
		// istanza è rappresenzatazione fisica della classe Smartphone
		Smartphone sm1 = new Smartphone();
		
		sm1.setImei("123123");
		sm1.setMarca("apple");
		sm1.setModello("iPhoneX");
		
		Smartphone sm2 = new Smartphone();
		
		sm2.setImei("456456");
		sm2.setMarca("samsung");
		sm2.setModello("note7");
		

	}

}
