package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Сколько будет чисел ?");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.println("Введите числа (по одному)");

		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("Введённые элементы");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}//Доделать
}
