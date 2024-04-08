package com.calculator;

import java.util.Scanner;

public class MainCall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isvalid = false;
		int count = 1;

		while (!isvalid && count <= 2) {
			System.out.println("Enter your Operation");
			String operation = sc.nextLine();
			switch (operation) {
			case "Addition":
				Addition add = new Addition();
				add.add();
				isvalid = true;
				break;
			case "Subtraction":
				Substraction sub = new Substraction();
				sub.sub();
				isvalid = true;
				break;
			case "Multiplication":
				Multiplication multiply = new Multiplication();
				multiply.multiplication();
				isvalid = true;
				break;
			case "Division":
				DivisionOp division = new DivisionOp();
				division.division();
				isvalid = true;
				break;
			case "Modulus":
				ModuloOp mod = new ModuloOp();
				mod.modulo();
				isvalid = true;
				break;
			case "Square":
				SquareOp sq = new SquareOp();
				sq.square();
				isvalid = true;
				break;
			case "Cube":
				CubeNumber cub = new CubeNumber();
				cub.getCubeofNum();
				isvalid = true;
				break;
			case "Average":
				AvgNumber avg = new AvgNumber();
				avg.avgNumber();
				isvalid = true;
				break;
			case "Factors":
				FactorsOfNum fac = new FactorsOfNum();
				fac.factorsNum();
				isvalid = true;
				break;
			case "even&odd":
				EvenOdd evod = new EvenOdd();
				evod.evenOdd();
				isvalid = true;
				break;
			default:
				System.out.println("Invalid operation. Please retry.");
				count++;
				if (count > 2) {
					System.out.println("Maximum retry limit reached.");
				}
			}
		}
		sc.close();
	}
}