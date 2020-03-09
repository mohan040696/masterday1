package org.javaprograms;

public class ToGetParticularCharInString {

	public static void main(String[] args) {
		String s="aAbBcC1@2#3$";
		String res1 = s.replaceAll("[a-zA-Z0-9]+", "");
		System.out.println(res1);
	}

}
