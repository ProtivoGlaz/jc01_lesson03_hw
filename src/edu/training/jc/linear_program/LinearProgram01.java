package edu.training.jc.linear_program;

import java.util.Scanner;

// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class LinearProgram01 {

	public static void main(String[] args) {
		double a, b;
		double c;
		double perimetr, area;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите число а: ");
		a = input.nextDouble();
		System.out.print("Введите число b: ");
		b = input.nextDouble();		
		
		c = Math.hypot(a, b);
		perimetr = a + b + c;
		area = (a * b) / 2;
		
		System.out.printf("Периметр равен: %.2f\n", perimetr);
		System.out.printf("Площадь равна: %.2f\n", area);
		
		input.close();
	}

}
