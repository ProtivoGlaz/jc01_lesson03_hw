package edu.training.jc.linear_program;

import java.util.Scanner;

/*
 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2),(х3, у3).
 * Найти его периметр и площадь.
 * (для проверки можете раскоментить блоки кода)
 */

public class LinearProgram03 {

	public static void main(String[] args) {
		// Координаты
		double x1, y1;
		double x2, y2;
		double x3, y3;
		
		// искомое
		double perimetr, area, p;
		
		Scanner input = new Scanner(System.in);
		
		// ввод с консоли
		System.out.println("Введите координаты трёх вершин треугольника");
		System.out.print("x1 и y1(через пробел): ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("x2 и y2(через пробел): ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		System.out.print("x3 и y3(через пробел): ");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		/*
		// вывод
		System.out.printf("x1 = %.1f y1 = %.1f\n", x1, y1);
		System.out.printf("x2 = %.1f y2 = %.1f\n", x2, y2);
		System.out.printf("x3 = %.1f y3 = %.1f\n", x3, y3);
		*/
		// создание сторон треугольника
		double AB = segment(x1, y1, x2, y2);
		double BC = segment(x2, y2, x3, y3);
		double CA = segment(x3, y3, x1, y1);
		
		// вывод в консоль
		System.out.printf("AB = %.1f BC = %.1f CA = %.1f\n", AB, BC, CA);
		
		// проверка на существование треугольника
		if ((AB + BC > CA) && (BC + CA > AB) && (AB + CA > BC)) {
			System.out.println("Треугольник существует");
			// если существует, то вычислить периметр и площадь
			perimetr = AB + BC + CA;
			p = perimetr / 2;
			area = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
			
			// Вывод ответа на задачу
			System.out.printf("Периметр треугольника равен: %.2f; Площадь треугольника равна: %.2f\n ", perimetr, area);
		} else {
			System.out.println("Треугольник не существует");
		}
		
		
		input.close();
	}
	// метод на создание стороны по двум точкам
	public static double segment(double xa, double ya, double xb, double yb) {
		return Math.hypot(xb - xa, yb - ya);
	}

}
