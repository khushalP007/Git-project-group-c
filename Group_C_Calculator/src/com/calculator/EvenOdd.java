package com.calculator;

import java.util.Scanner;

public class EvenOdd {
	   public void evenOdd() {
	       
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number : ");
	        int num = scanner.nextInt();

	        if (num % 2 == 0) {
	            System.out.println(num + " is even");
	        } else {
	            System.out.println(num + " is odd");
	        }
	    }
}
