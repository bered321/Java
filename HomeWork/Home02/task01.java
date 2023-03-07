// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

package HomeWork.Home02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

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

    // public static void log(int[] arr) throws IOException {
    //     Logger logger = Logger.getLogger(task01.class.getName());
    //     FileHandler fh = new FileHandler("log.txt");
    //     logger.addHandler(fh);
    //     SimpleFormatter sFormat = new SimpleFormatter();
    //     fh.setFormatter(sFormat);
    //     String joinedString = Arrays.toString(arr);
    //     logger.info(joinedString);
    // }

    public static int[] sort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(task01.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;

                }
            }
            String joinedString = Arrays.toString(arr);
            logger.info(joinedString);
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
            
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        System.out.printf("Введите через пробел массив чисел: ");
        Scanner iScanner = new Scanner(System.in);
        String text = iScanner.nextLine();
        String[] arr = text.split(" ");
        iScanner.close();
        int[] firstArray = createArray(arr);
        System.out.printf("Начальный массив: ");
        printArray(firstArray);
        System.out.print("\n");
        int[] secondArray = sort(firstArray);
        System.out.print("\n");
        System.out.printf("Конечный массив: ");
        printArray(secondArray);
    }

}
