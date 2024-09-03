package Logical_Programs;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please provide string that needs to be checked");
//		String name = Integer.toString(scn.nextInt());
		String name = scn.nextLine();
//		String name = "nayan";
		String reverseName = "";
		
		for(int i=0; i<=name.length()-1; i++) {
			reverseName = reverseName + name.charAt(i);	
		}
		
		if(reverseName.equalsIgnoreCase(name))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is NOT palindrome");
	}

}
