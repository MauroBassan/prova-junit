package it.corso.java.operatori;

public class OperatoriAritmetici {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		//System.out.println(a +=b);
		
		if(a > b && b <= 20) {
			System.out.println("eccomi and!");
		}
		
		if(a > b || b <= 20) {
			System.out.println("eccomi or!");
		}

		if(!(a > b)) {
			System.out.println("eccomi not");
		}
		
		long l1 = a; // casting implicito
		
		int d = (int)l1; //casting esplicito
	}

}
