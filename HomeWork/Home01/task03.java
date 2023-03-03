// Задача 3. Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package HomeWork.Home01;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        double num1 = iScanner.nextDouble();
        System.out.printf("Введите действие: ");
        char action = iScanner.next().charAt(0);
        System.out.printf("Введите число: ");
        double num2 = iScanner.nextDouble();
        if (action == '+'){
            System.out.println("Сумма чисел: " + (num1+num2));
        }
        else if (action == '-' ) {
            System.out.println("Разность чисел: "+(num1-num2));
        }
        else if (action == '/' && num2 == 0.0 ) {
            System.out.println("Делить на ноль нельзя!!!");
        }
        else if (action == '/' ) {
            System.out.println("Частное чисел: " + (num1/num2));
        }
        else if (action == '*' ) {
            System.out.println("Произведение чисел: " + (num1*num2));
        }
        iScanner.close();
    }
}


