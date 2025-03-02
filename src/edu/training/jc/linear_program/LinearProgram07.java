package edu.training.jc.linear_program;

import java.util.Scanner;

//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class LinearProgram07 {

	public static void main(String[] args) {
		double a, b;
		
		double average_arithmetic, average_geometric;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите два числа через пробел: ");
		a = input.nextDouble();
		b = input.nextDouble();
		
		average_arithmetic = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		average_geometric = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.printf("Среднее арифметическое: %.2f\nСреднее геометрическое: %.2f\n",average_arithmetic, average_geometric);
		
		input.close();
	}

}
