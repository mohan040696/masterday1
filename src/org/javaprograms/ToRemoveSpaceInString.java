package org.javaprograms;

public class ToRemoveSpaceInString {

	public static void main(String[] args) {
		
		String s="Karthick Raja";
		String res = s.replaceAll("\\s","");
		System.out.println(res);
	}

}
