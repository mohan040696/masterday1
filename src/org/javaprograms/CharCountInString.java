package org.javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountInString {

	public static void main(String[] args) {
		String s="name is karthick Raja";
		char[] ch = s.toCharArray();
		Map<Character,Integer>mp=new LinkedHashMap<>();
		for (char c : ch) {
			if (mp.containsKey(c)) {
				Integer i = mp.get(c);
				mp.put(c, i+1);
			}
			else {
				mp.put(c, 1);
			}
		
		}
		
		System.out.println(mp);

	}

}
