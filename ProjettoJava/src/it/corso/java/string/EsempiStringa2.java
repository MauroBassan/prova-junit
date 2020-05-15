package it.corso.java.string;

public class EsempiStringa2 {
	public static void main (String[] args) {
		EsempiStringa e = new EsempiStringa();
		
		int oc = e.contaOccorrenze("corso java", "m");
		
		System.out.println(oc);
		
		
	}
	
	
	public boolean isPalindroma(String str1) {
		
		String str2="";
		
		for (int i = str1.length()-1; i >= 0; i--) {
			str2 += str1.charAt(i);
		}
		
		return str1.equals(str2);
	}
	
	public int contaOccorrenze(String str1, String token) {
		int nOccorrenze = 0;
		
		for (int i = 0; i <= str1.length() -token.length(); i++) {
			String temp = str1.substring(i, i+token.length());
			if(temp.equals(token)) {
				nOccorrenze++;
			}
		}
		return nOccorrenze;
	}
}
