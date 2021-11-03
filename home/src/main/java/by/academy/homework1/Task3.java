package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {       //������ � ������� ����� �� 1 �� 10, ������� �� ����� ������� ��������� ��� ����� �����. (10 �����).
        Scanner sc = new Scanner(System.in);
        System.out.println("������ � ������� ����� �� 1 �� 10");
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            sc.close();
        } else {
            System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
            return;
        }
        if (number >= 1 && number <= 10) {
            for (int i = 0; i < 10; i++) {
                System.out.println(number + " x " + (i + 1) + " = " + (number * (i + 1)));
            }
        } else {
            System.out.println("�������� ����. ���������� ������ ����� �� 1 �� 10. ������������� ��������� � ���������� �����!");
        }
    }
}

