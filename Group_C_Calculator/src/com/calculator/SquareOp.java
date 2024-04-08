package com.calculator;

import java.util.Scanner;

public class SquareOp implements myinterface {
	public void square() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		int y = a * a;
		System.out.println("Square is" + y);

	}

	@Override
	public void division(int a, int b) {
		
	}

	@Override
	public void modulo(int a) {
	

	}

	@Override
	public void sqaure(int a, int b) {
		
	}

}
