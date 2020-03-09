package org.javaprograms;

public class StringReverse {

	public static void main(String[] args) {
		String s="Karthick Raja";
		String res="";
		char[] ch = s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			char rev = ch[i];
			res=res+rev;
		}
		System.out.println(res);
	}

}
