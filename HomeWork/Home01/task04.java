// Задача 4. Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package HomeWork.Home01;

import java.text.BreakIterator;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        System.out.printf("Введите уравнение: ");
        Scanner iScanner = new Scanner(System.in);
        String equation = iScanner.nextLine();
        int count = 0;
        char a = equation.charAt(0);
        char b = equation.charAt(1);
        char c = equation.charAt(3);
        char d = equation.charAt(4);
        int answer = Integer.parseInt(String.valueOf(equation.charAt(6)) + String.valueOf(equation.charAt(7)));
        if (a == '?') {
            int b1 = Integer.parseInt(String.valueOf(b));
            if (c == '?') {
                int d1 = Integer.parseInt(String.valueOf(d));
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (i * 10 + b1 + j * 10 + d1 == answer) {
                            a = Integer.toString(i).charAt(0);
                            c = Integer.toString(j).charAt(0);
                            count = 1;
                            break;
                        }
                    }
                }
                if (count == 0) {
                    System.err.println("Решений нет!");
                    System.exit(1);
                }
                System.out.println((Integer.parseInt(String.valueOf(a)) * 10 + b1) + "+"
                        + (Integer.parseInt(String.valueOf(c)) * 10 + d1) + "=" + answer);
            } else if (d == '?') {
                int c1 = Integer.parseInt(String.valueOf(c));
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if ((i * 10 + b1) + (c1 * 10 + j) == answer) {
                            a = Integer.toString(i).charAt(0);
                            d = Integer.toString(j).charAt(0);
                            count = 1;
                            break;
                        }
                    }
                }
                if (count == 0) {
                    System.err.println("Решений нет!");
                    System.exit(1);
                }
                System.out.println((Integer.parseInt(String.valueOf(a)) * 10 + b1) + "+"
                        + (c1 * 10 + Integer.parseInt(String.valueOf(d))) + "=" + answer);
            }
        } else if (b == '?') {
            int a1 = Integer.parseInt(String.valueOf(a));
            if (c == '?') {
                int d1 = Integer.parseInt(String.valueOf(d));
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if ((a1 * 10 + i) + j * 10 + d1 == answer) {
                            b = Integer.toString(i).charAt(0);
                            c = Integer.toString(j).charAt(0);
                            count = 1;
                            break;
                        }
                    }
                }
                if (count == 0) {
                    System.err.println("Решений нет!");
                    System.exit(1);
                }
                System.out.println(a1 * 10 + (Integer.parseInt(String.valueOf(b))) + "+"
                        + (Integer.parseInt(String.valueOf(c)) * 10 + d1) + "=" + answer);
            } else if (d == '?') {
                int c1 = Integer.parseInt(String.valueOf(c));
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if ((a1 * 10 + i) + (c1 * 10 + j) == answer) {
                            b = Integer.toString(i).charAt(0);
                            d = Integer.toString(j).charAt(0);
                            count = 1;
                            break;
                        }
                    }
                }
                if (count == 0) {
                    System.err.println("Решений нет!");
                    System.exit(1);
                }
                System.out.println(a1 * 10 + (Integer.parseInt(String.valueOf(b))) + "+"
                        + (c1 * 10 + Integer.parseInt(String.valueOf(d))) + "=" + answer);
                iScanner.close();
            }
        }
    }
}
