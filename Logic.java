// Write a program that checks if a given integer is a prime number.

package com.logic;
import java.util.Scanner;
public class Logic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int n = scan.nextInt();
		boolean b = false;
		for( int i = n-1; i>1;i--) {
			if(n%i == 0) {
				b = true;
			}
		}
		if(b == true ) {
			System.out.println("Not a prime number!");
		}
		else {
			System.out.println("This is prime number!");
		}
		

	}

}
