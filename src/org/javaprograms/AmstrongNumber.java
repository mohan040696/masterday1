package org.javaprograms;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		int num=561;
		int rem=0;
		int res=0;
		int temp=num;
		while (num>0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
			if (res==temp) {
				System.out.println("given number is Amstrong: "+res);
			}
			else {
			System.out.println("given number is not Amstrong");	
			}
	}

}
