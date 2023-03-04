//Задача 2. Вывести все простые числа от 1 до 1000

package HomeWork.Home01;

public class task02 {
    public static void main(String[] args) {
        int flag;
        for (int i = 2; i <= 1000; i++) {
            flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
