package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for (int a = 1; a <= number; a++) {
		if (a%5==0)System.out.print("#"+ " ");
		
		System.out.print(a + " ");
		}
	}

}
