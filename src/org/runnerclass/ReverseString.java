package org.runnerclass;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		String reversed = reverseString(input);
		System.out.println("Reversed string:" + reversed);
		
		
	}

	public static String reverseString(String input) {
		StringBuilder sb = new StringBuilder(input);
		return sb.reverse().toString();
	}

}
