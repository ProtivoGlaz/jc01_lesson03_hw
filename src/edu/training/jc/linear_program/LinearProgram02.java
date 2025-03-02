package edu.training.jc.linear_program;

import java.util.Scanner;

//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

public class LinearProgram02 {

	public static void main(String[] args) {
		double x1, y1;
		double x2, y2;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите x1 и y1 через пробел: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.print("Введите x2 и y2 через пробел: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		System.out.printf("x1 = %.1f y1 = %.1f\n",x1, y1);
		System.out.printf("x2 = %.1f y2 = %.1f\n", x2, y2);
		
		// Вычисление расстояния между точками
        double AB = Math.hypot(x2 - x1, y2 - y1);

        System.out.printf("AB = %.3f\n", AB);
		
		input.close();
	}

}
