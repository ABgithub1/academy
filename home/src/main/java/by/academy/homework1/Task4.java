package by.academy.homework1;
//�������� �� ������� ������� ������, ���� ��������� �� ����� ������, ��� 1_000_000.
public class Task4 {
    public static void main(String[] args) {
        int res = 0;
        int degree = 1;
        System.out.println("������� ����� 2 � �������");
        System.out.println("�������: 0  ����� ����� � ������� ������� ����� 1 (����� ���� :))");
        for (int i = 1; res < 1_000_000; i++) {
            res = i * 2;
            i = res;
            degree++;
            System.out.println("�������: " + degree + " " + " ��������� ����������: " + res);
        }
    }
}

