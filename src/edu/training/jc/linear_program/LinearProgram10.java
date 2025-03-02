package edu.training.jc.linear_program;

import java.util.Scanner;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class LinearProgram10 {

	public static void main(String[] args) {
		double length;
		
		double area;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите длину окружности: ");
		length = input.nextDouble();
		
		area = Math.pow(length, 2) / (4 * Math.PI);
		
		System.out.printf("Площадь круга равна: %.2f\n", area);
		
		input.close();
	}

}
