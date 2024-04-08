package com.calculator;

import java.util.Scanner;

public class FactorsOfNum {
	public void factorsNum() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println("Factors of " + number + " are:" + i) ;
			}
		}

	}
}
