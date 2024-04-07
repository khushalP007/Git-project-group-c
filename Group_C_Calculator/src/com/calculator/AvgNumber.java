package com.calculator;

import java.util.Scanner;

public class AvgNumber {
	public void avgNumber() {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter five numbers
	        System.out.println("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Enter third number: ");
	        double num3 = scanner.nextDouble();

	        System.out.println("Enter fourth number: ");
	        double num4 = scanner.nextDouble();

	        System.out.println("Enter fifth number: ");
	        double num5 = scanner.nextDouble();

	        // Calculate the total sum
	        double sum = num1 + num2 + num3 + num4 + num5;

	        // Calculate the average
	        double average = sum / 5;

	        // Print the total sum and average
	        System.out.println("Total sum is: " + sum);
	        System.out.println("Average is: " + average);

	       
	}
}
