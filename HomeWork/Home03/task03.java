// Задача 3. Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее ариф. из этого списка.

package HomeWork.Home03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class task03 {
    public static int sum(Integer[] array) {
        return Arrays.stream(array)
          .mapToInt(Integer::intValue)
          .sum();
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(1, 20);
            arr.add(x);
        }
        System.out.println("Начальный массив: " + arr.toString());
        System.out.println("Максимальное значение: " + Collections.max(arr));
        System.out.println("Минимальное значение: " + Collections.min(arr));
        int[] arr_2 = arr.stream().mapToInt(i -> i).toArray();
        System.out.println("Среднее значение: " + IntStream.of(arr_2).average().getAsDouble());
    }
}