package org.javaprograms;

public class RemoveSpaceInString {
	
	public static void main(String[] args) {
		String s=" kar thick Ra ja ";
		String trim = s.trim();
		System.out.println("using trim: "+trim);
		String withoutSpace = s.replaceAll("\\s", "");
		System.out.println("using replaceall: "+withoutSpace);
	}

}
