package edu.training.jc.linear_program;

import java.util.Scanner;

//Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

public class LinearProgram09 {

	public static void main(String[] args) {
		double a;
		
		double height, area, r, R;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите длину стороны равностороннего треугольника: ");
		a = input.nextDouble();
		
		height = (a * Math.sqrt(3)) / 2;
		area = (a * height) / 2;
		r = (a * Math.sqrt(3)) / 6;
		R = (a * Math.sqrt(3)) / 3;
		
		System.out.printf("Площадь: %.2f\nВысота: %.2f\nРадиус(вписанной окружности): %.2f\nРадиус(описанной окружности): %.2f\n", area, height, r, R);
		
		input.close();
	}

}
