package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("������� �������");
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            if (age > 0 && age < 130) {
                System.out.println("������� C����");
                double sumMoney = 0;
                if (sc.hasNextDouble()) {
                    sumMoney = sc.nextDouble();
                    if (sumMoney >= 0) {
                        if ((sumMoney > 0) && (sumMoney < 100)) {
                            sumMoney = sumMoney - (sumMoney * 0.05);
                            System.out.println("���� ����� � 5% ������� �����: " + sumMoney);
                        } else if ((sumMoney >= 100) && (sumMoney < 200)) {
                            sumMoney = sumMoney - (sumMoney * 0.07);
                            System.out.println("���� ����� � 7% ������� �����: " + sumMoney);
                        } else if ((sumMoney >= 200) && (sumMoney < 300)) {
                            if (age > 18) {
                                sumMoney = sumMoney - (sumMoney * (0.12 + 0.04));
                                System.out.println("���� ����� �o ����������� ������� �����: " + sumMoney);
                            } else {
                                sumMoney = sumMoney - (sumMoney * (0.12 - 0.03));
                                System.out.println("���� ����� � ��������� ������� �����: " + sumMoney);
                            }
                        } else if ((sumMoney >= 300) && (sumMoney < 400)) {
                            sumMoney = sumMoney - (sumMoney * 0.15);
                            System.out.println("���� ����� � 15% ������� �����: " + sumMoney);
                        } else if (sumMoney >= 400) {
                            sumMoney = sumMoney - (sumMoney * 0.2);
                            System.out.println("���� ����� � 20% ������� �����: " + sumMoney);
                        } else {
                            System.out.println("������ �� ������");
                        }
                    } else {
                        System.out.println("�������� ����. ����� ������ ���� >= 0");
                    }
                } else {
                    System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
                }
            } else if (age > 130) {
                System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
            } else {
                System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
            }
        } else {
            System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
        }
        sc.close();
    }
}

