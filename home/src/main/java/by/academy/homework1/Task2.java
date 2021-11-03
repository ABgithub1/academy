package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ��� ������ (Integer/Double/Float/Char/String)");
        String input = sc.nextLine();

        switch (input) {

            case "Integer":
                System.out.println("Case Integer");
                System.out.println("����� ������� �� ������� ����� X �� ����� Y");
                System.out.println("������� ����� X");
                int numX;
                int numY;
                if (sc.hasNextInt()) {
                    numX = sc.nextInt();
                } else {
                    System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
                    break;
                }
                System.out.println("������� ����� Y");
                if (sc.hasNextInt()) {
                    numY = sc.nextInt();
                } else {
                    System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
                    break;
                }
                System.out.println("������� �� ������� ����� " + numX + " �� " + numY + " �����: " + numX % numY);
                break;

            case "Double":
                double numDb;
                double pr;
                System.out.println("Case Double");
                System.out.println("���������� �������� �� �����");
                System.out.println("������� �����");
                if (sc.hasNextDouble()) {
                    numDb = sc.nextDouble();
                } else {
                    System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
                    break;
                }
                System.out.println("������� ��������� ����� ��������� ?");
                if (sc.hasNextDouble()) {
                    pr = sc.nextDouble();
                } else {
                    System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
                    break;
                }
                System.out.println(pr + " % �� " + numDb + " ����� " + pr / 100 * numDb);
                break;

            case "Float":
                float numFl;
                System.out.println("Case Float");
                System.out.println("���������� � �������");
                System.out.println("������� �����");
                if (sc.hasNextFloat()) {
                    numFl = sc.nextFloat();
                } else {
                    System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
                    break;
                }
                System.out.println(numFl + " � �������� ����� " + numFl * numFl); // ������� ����� ������� ����� �����
                // Math.pow() , �� �� ����� ��� Double
                break;

            case "Char":
                System.out.println("Case Char");
                System.out.println("������� ������ (����)");
                char symbol = sc.next().charAt(0);
                System.out.println("HTML-���" + " ������� " + symbol + " = " + (int) symbol);
                break;

            case "String":
                String str;
                System.out.println("Case String");
                System.out.println("������� ������");
                if (sc.hasNext()) {
                    str = sc.next();
                } else {
                    System.out.println("�������� ����. ������������� ��������� � ���������� �����!");
                    break;
                }
                System.out.println("Hello " + str);
                break;

            default:
                System.out.println("������ �����");
        }
        sc.close();
    }
}
