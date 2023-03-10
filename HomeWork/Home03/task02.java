// Задача 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

package HomeWork.Home03;

import java.util.ArrayList;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(1, 10);
            arr.add(x);
        }
        System.out.printf("Начальный массив: ");
        System.out.printf(arr.toString());
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.printf("\nКонечный массив: ");
        System.out.printf(arr.toString());
    }
}
