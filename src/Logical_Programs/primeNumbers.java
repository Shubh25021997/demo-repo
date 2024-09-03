package Logical_Programs;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		int number = scn.nextInt();
		
		for(int i=2; i<number; i++) {
		int rem = number % i;
			if(rem==0) {
			System.out.println("not a prime number");
			break;}
			
			if(rem!=0 && i == number-1)
				System.out.println("Prime number");
		}
		

	}
}
