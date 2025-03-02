package edu.training.jc.linear_program;

import java.util.Scanner;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class LinearProgram04 {

	public static void main(String[] args) {
		double radius;
		
		double c, s;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите радиус окружности: ");
		radius = input.nextDouble();
		
		c = 2 * Math.PI * radius;
		s = Math.PI * Math.pow(radius, 2);
		
		System.out.printf("Длина окружности равна: %.2f\nПлощадь круга равна: %.2f\n", c, s);
		
		input.close();
	}

}
