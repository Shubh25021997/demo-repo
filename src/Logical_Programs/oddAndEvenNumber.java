package Logical_Programs;

import java.util.Scanner;

public class oddAndEvenNumber {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		int number = scn.nextInt();
		

		if(number % 2 ==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	}

}
