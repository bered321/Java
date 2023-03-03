
// Задача1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// а так же n! (произведение чисел от 1 до n)

package HomeWork.Home01;


import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        while (num == 0 || num < 0) {
            System.out.println("Вы ошиблись!!! Введите верное число!!");
            num = iScanner.nextInt();
        }
        int sum = 0;
        int fact = 1;
        for (int i = 1; i < num+1; i++) {
            fact = fact*i;
            sum += i; 
        }
        iScanner.close();
        System.out.printf("Сумма чисел: %d\n", sum);
        
        System.out.printf("Факториал числа: %d", fact);
    }
}
