package org.javaprograms;

public class DeleteFirstCahrString {

	public static void main(String[] args) {
		String s="Have A Good Day";
		String res="";
		String[] split = s.split(" ");
		for (int i=0; i<=split.length-1; i++) {
			String rev = split[i];
			String substring = rev.substring(1);
			res=res+substring+" ";
			
		}
		System.out.println(res);
		
	}

}
