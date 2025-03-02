package edu.training.jc.linear_program;

import java.util.Scanner;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

public class LinearProgram08 {

	public static void main(String[] args) {
		double length;
		
		double one_area;
		double all_area;
		double volume;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите длину ребра куба: ");
		length = input.nextDouble();
		
		
		one_area = Math.pow(length, 2);
		all_area = one_area * 6;
		volume = Math.pow(length, 3);
		
		System.out.printf("Площадь одной грани: %.2f\nПлощадь полной поверхности: %.2f\nОбъем куба: %.2f\n", one_area, all_area, volume);
		
		input.close();
	}

}
