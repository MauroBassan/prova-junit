package it.corso.java.oop;

import java.util.Date;

public class TestMetodoInstanceOf {

	public static void main(String[] args) {

		String test = "";
		System.out.println(test instanceof String);
		
		String test2 = null;
		System.out.println( test2 instanceof String);
		
		System.out.println(converti("abc"));
		System.out.println(converti(new StringBuffer("def")));
		System.out.println(converti( new Date()));

	}
	
	public static String converti(Object obj) {
		
		if(obj instanceof String) {
			return((String) obj).toUpperCase();
		} else if(obj instanceof StringBuffer) {
			return((StringBuffer) obj).toString().toUpperCase();
		}
		return obj.toString();
	}

}
