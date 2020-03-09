package org.javaprograms;

public class PalindromeNumber {
	//it's also for reverse the number
	
	public static void main(String[] args) {
		
		int num=1234321;
		int rem=0;
		int res=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			res=(res*10)+rem;
			num=num/10;
		}
		if (res==temp) {
			System.out.println("given number "+res+" is palindrome");
		}
		else {
			System.out.println("given number is not palindrome");
		}
	}
}
