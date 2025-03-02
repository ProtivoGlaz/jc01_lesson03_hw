package edu.training.jc.linear_program;

import java.util.Scanner;

//Найти произведение цифр заданного четырехзначного числа.
public class LinearProgram06 {

	public static void main(String[] args) {
		int num;
		
		int res = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Введите четырехзначное число: ");
		num = input.nextInt();
		
		while (num != 0) {
			res *= num % 10;
			num /= 10;
		}
		
		System.out.println("Результат: " + res);
		
		input.close();
	}

}
