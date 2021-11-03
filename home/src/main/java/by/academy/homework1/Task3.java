package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {       //Ââåñòè ñ êîíñîëè ÷èñëî îò 1 äî 10, âûâåñòè íà ıêğàí òàáëèöó óìíîæåíèÿ äëÿ ıòîãî ÷èñëà. (10 ÷èñåë).
        Scanner sc = new Scanner(System.in);
        System.out.println("Ââåñòè ñ êîíñîëè ÷èñëî îò 1 äî 10");
        int number;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            sc.close();
        } else {
            System.out.println("Íåâåğíûé ââîä. Ïåğåçàïóñòèòå ïğîãğàììó è ïîïğîáóéòå ñíîâà!");
            return;
        }
        if (number >= 1 && number <= 10) {
            for (int i = 0; i < 10; i++) {
                System.out.println(number + " x " + (i + 1) + " = " + (number * (i + 1)));
            }
        } else {
            System.out.println("Íåâåğíûé ââîä. Íåîáõîäèìî ââåñòè ÷èñëî îò 1 äî 10. Ïåğåçàïóñòèòå ïğîãğàììó è ïîïğîáóéòå ñíîâà!");
        }
    }
}

