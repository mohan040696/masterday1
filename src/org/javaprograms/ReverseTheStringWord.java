package org.javaprograms;

public class ReverseTheStringWord {

	public static void main(String[] args) {
		String s="My Name is Raja";
		String res="";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String st = split[i];
			String rev="";
			for (int j = st.length()-1; j>=0; j--) {
				char ch = st.charAt(j);
				rev=rev+ch;
				
			}
			res=res+rev+" ";
			
		}
		System.out.println(res);
	}

}
