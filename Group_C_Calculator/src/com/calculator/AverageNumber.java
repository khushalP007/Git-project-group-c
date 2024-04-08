package com.calculator;

import java.util.Scanner;

public class AverageNumber {
	
	public int getAverageofNumber(int a,int b,int c,int d,int e) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number>>");
		a = sc.nextInt();
		System.out.println("Enter the second number>>");
		b = sc.nextInt();
		System.out.println("Enter the third number>>");
		c = sc.nextInt();
		System.out.println("Enter the fourth numbe>>r");
		d = sc.nextInt();
		System.out.println("Enter the fifth number>>");
		e = sc.nextInt();
		int total = a+b+c+d+e;
		System.out.println("Total sum is>>"+total);
		int average = total/5;
		System.out.println("Average is>>"+average);
		return average;
	}	

}
