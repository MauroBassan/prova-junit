package it.corso.java.cicli;

public class TestCicli {

	public static void main(String[] args) {
		ForWhileDoWhile test = new ForWhileDoWhile();
		
		test.iteraWhile(1, 20);
		test.iteraDowhile(1, 10);
		// se eseguo il dowhile con altro valore, il do lo esegue SEMPRE
		test.iteraDowhile(20, 20);
		test.iteraFor(6);
		
		test.iteraWhileModulo(10, 20);
		
		String[] array = new String[] {"testo1","testo2","testo3"};
		test.iteraArr(array);
		test.iteraArr2(array);
		
		int [] arrayInt = new int [] {1,2,3,4,5,6,7,8,9};
		test.iteraArr2(arrayInt);
		
		System.out.println("-----------------------");
		
		BreakContinue bc = new BreakContinue();
		
		bc.esempioBreak(5, 50);
		bc.esempioContinue(10, 20);
		
	}

}
