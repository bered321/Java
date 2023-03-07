// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package HomeWork.Home02;

import java.util.Scanner;

public class task01 {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static int[] createArray(String[] arr) {
        int[] first = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            first[i] = Integer.valueOf(arr[i]);
        }
        return first;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.printf("Введите через пробел массив чисел: ");
        Scanner iScanner = new Scanner(System.in);
        String text = iScanner.nextLine();
        String[] arr = text.split(" ");
        iScanner.close();
        int[] firstArray = createArray(arr);
        System.out.printf("Начальный массив: ");
        printArray(firstArray);
        System.out.printf("Конечный массив: ");
        int[] secondArray = sort(firstArray);
        printArray(secondArray);
    }

}
