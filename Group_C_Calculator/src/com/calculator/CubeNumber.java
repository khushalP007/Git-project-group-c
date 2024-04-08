package com.calculator;

import java.util.Scanner;

public class CubeNumber {
	public int getCubeofNum(int num) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number>>");
		num = sc.nextInt();
		System.out.println("cube is>>" + num * num * num);

		return num;
	}

}
