package org.javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0; int b=1;int c=0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <=5; i++) {
			c=a+b;
			System.out.println("fibanocci series"+c);
			a=b;
			b=c;
			
		}
		
	}

}
