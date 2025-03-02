package edu.training.jc.linear_program;

//Написать программу, которая выводит на экран первые четыре степени числа π.

public class LinearProgram05 {

	public static void main(String[] args) {
		double res = Math.PI;
		// Это решение, если не брать в степень i, а возводить число пи каждый раз на само себя (на последней итерации сработает переполнение)
		for (int i = 0; i < 4; i++) {
			
			res *= res;
			System.out.println(res);
		}
		// Это решение если брать счётчик из цикла, и начинать с 1
		/*
		 * for (int i = 0; i < 4; i++) {
		 *	System.out,println(Math.pow(Math.PI, i + 1));
		 * }
		 */
	}

}
