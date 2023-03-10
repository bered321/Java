// Задача 1. (Дополнительно) Реализовать алгоритм сортировки слиянием

package HomeWork.Home03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task01 {
    public static int[] createArray(int N) {
        Random rand = new Random();
        int[] first = new int[N];
        for (int i = 0; i < first.length; i++) {
            int x = rand.nextInt(1, 10);
            first[i] = x;
        }
        return first;

    }

    public static int[] mergeArray(int[] arrayL, int[] arrayR) {
        int[] arrayC = new int[arrayL.length + arrayR.length];
        int posL = 0, posR = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (posL < arrayL.length && posR < arrayR.length) {
                if (arrayL[posL] < arrayR[posR]) {
                    arrayC[i] = arrayL[posL];
                    posL++;
                } else {
                    arrayC[i] = arrayR[posR];
                    posR++;
                }
            } else if (posL == arrayL.length && posR < arrayR.length) {
                arrayC[i] = arrayR[posR];
                posR++;
            }
            else if (posL < arrayL.length && posR == arrayR.length) {
                arrayC[i] = arrayL[posL];
                posL++;
            }else{
                arrayC[i] = 0;
            }
        }
        return arrayC;
    }

    public static int[] sortArray(int[] firstArray) {
        if (firstArray == null) {
            return null;
        }
        int length_arr = firstArray.length / 2;

        if (firstArray.length < 2) {
            return firstArray;
        }
        if (firstArray.length % 2 != 0) {
            length_arr += 1;
        }
        int[] arrayR = new int[length_arr];
        int[] arrayL = new int[firstArray.length / 2];
        System.arraycopy(firstArray, 0, arrayL, 0, firstArray.length / 2);
        System.arraycopy(firstArray, firstArray.length / 2, arrayR, 0, firstArray.length - firstArray.length / 2);
        arrayL = sortArray(arrayL);
        arrayR = sortArray(arrayR);
        return mergeArray(arrayL, arrayR);
    }

    public static void main(String[] args) {
        System.out.printf("Введите длину массива: ");
        Scanner iScanner = new Scanner(System.in);
        int N = iScanner.nextInt();
        int[] firstArray = createArray(N);
        iScanner.close();
        System.out.printf("Начальный массив: ");
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = sortArray(firstArray);
        System.out.printf("Конечный массив: ");
        System.out.println(Arrays.toString(secondArray));
    }
}
