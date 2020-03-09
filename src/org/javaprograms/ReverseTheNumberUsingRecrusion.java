package org.javaprograms;

import java.util.Scanner;

public class ReverseTheNumberUsingRecrusion {
	
	public static void reverseMethod(int num) {
		if (num<10) {
			System.out.println(num);
			//return;
		}
		else {
			System.out.print(num%10);
			reverseMethod(num/10);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input number and press enter");
		int num = sc.nextInt();
		System.out.println("Reverse number of input is: ");
		reverseMethod(num);
		//System.out.println();
	}
}
