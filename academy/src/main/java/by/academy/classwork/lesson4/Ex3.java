package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int res = 1;
		int n = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("введите зеачение n");
		int s = sc.nextInt();
		System.out.println("вы ввели "+ s);
		while (n <= s) {
			res *=n;
			n++;
			
			System.out.println(res);
		}
	}
}
