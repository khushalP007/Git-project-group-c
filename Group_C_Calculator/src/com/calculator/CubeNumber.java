package com.calculator;

import java.util.Scanner;

public class CubeNumber {
	public int getCubeofNum() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		System.out.println("cube is " + num * num * num);

		return num;
	}

}
