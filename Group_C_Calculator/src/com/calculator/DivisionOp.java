package com.calculator;

import java.util.Scanner;

public class DivisionOp implements myinterface{

	public void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int a = sc.nextInt();
		System.out.println("Enter a second Number");
		int b = sc.nextInt();
		int x = a / b;
		System.out.println("Division is " + x);
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modulo(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sqaure(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	
	}


 