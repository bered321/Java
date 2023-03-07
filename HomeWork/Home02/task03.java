// Дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

package HomeWork.Home02;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task03 {
    public static void log(double num1, double num2, char action, double res) throws IOException {
        Logger logger = Logger.getLogger(task01.class.getName());
        FileHandler fh = new FileHandler("HomeWork/Home02/log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(Double.toString(num1)+" "+Character.toString(action)+" "+Double.toString(num2)+" = "+Double.toString(res));
    }
    public static void main(String[] args) throws IOException {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        double num1 = iScanner.nextDouble();
        System.out.printf("Введите действие: ");
        char action = iScanner.next().charAt(0);
        System.out.printf("Введите число: ");
        double num2 = iScanner.nextDouble();
        double res;
        if (action == '+'){
            System.out.println("Сумма чисел: " + (num1+num2));
            res = num1+num2;
            log(num1, num2, action, res);
        }
        else if (action == '-' ) {
            System.out.println("Разность чисел: "+(num1-num2));
            res = num1-num2;
            log(num1, num2, action, res);
        }
        else if (action == '/' && num2 == 0.0 ) {
            System.out.println("Делить на ноль нельзя!!!");
        }
        else if (action == '/' ) {
            System.out.println("Частное чисел: " + (num1/num2));
            res = num1/num2;
            log(num1, num2, action, res);
        }
        else if (action == '*' ) {
            System.out.println("Произведение чисел: " + (num1*num2));
            res = num1*num2;
            log(num1, num2, action, res);
        }
        iScanner.close();
    }
}


