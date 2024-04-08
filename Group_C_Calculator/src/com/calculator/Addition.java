package com.calculator;

import java.util.Scanner;

public class Addition {
	public void add() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a first number : ");
	        int a = scanner.nextInt();
	        System.out.print("Enter a second number : ");
	        int b = scanner.nextInt();
		System.out.println("Addition of first number and second number is : " + (a + b));

	}
}
