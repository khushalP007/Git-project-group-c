package com.calculator;

import java.util.Scanner;

public class MainCall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Operation");
        String operation = sc.nextLine();
        
		switch (operation) {
		case "div":
			DivisionOp division = new DivisionOp();
			division.division();
			break;
		case "mod":
			ModuloOp mod=new ModuloOp();
			mod.modulo();
			break;
		case "square":
			SquareOp sq=new SquareOp();
			sq.square();
			break;
			

		default:
			System.out.println("Invalid operation");
		}
	}
}