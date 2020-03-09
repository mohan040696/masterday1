package org.javaprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		int count=0;
		for (int i = 2; i <=num/2; i++) {
			if (num%i==0) {
				count=1;
		}
			if (count==0) {
				System.out.println("given number is prime");
			}
			else {
				System.out.println("given number is not prime");
			}
	}

	}
	}
