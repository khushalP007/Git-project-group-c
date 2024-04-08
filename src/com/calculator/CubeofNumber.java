package com.Calculator;

import java.util.Scanner;

public class CubeofNumber implements CalculatorMain {

	public void getCubeofNum(int num) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number>>");
		num = sc.nextInt();
		System.out.println("cube is>>" + num * num * num);

		
	}

}
