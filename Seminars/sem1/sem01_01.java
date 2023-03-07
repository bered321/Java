import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.Scanner;

//import java.util.Arrays;
// import java.util.Scanner;

// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//  Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

// import java.text.Format;
// import java.util.Scanner;

// public class sem01_01 {
//     public static void main(String[] args) {
//         System.out.printf("Введите имя: ");
//         Scanner iScanner = new Scanner(System.in);
//         String name = iScanner.nextLine();
//         System.out.printf("Привет %s!", name);   
//     }
// }

/*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести 
максимальное количество подряд идущих 1.*/

// public class sem01_01 {
//     public static void main(String[] args) {
//         int[] array = new int[]{1,1,0,1,1,1};
//         int n = 0;
//         int max = 0;
//         for (int i = 0; i < array.length; i++)
//         {
//             if (array[i] == 1)
//             {
//                 n++;
//             }
//             else if (max < n)
//             {
//                 max = n;
//                 n = 0;
//             }
//         }
//         if (max < n)
//             {
//                 max = n;
//                 n = 0;
//             }
//         System.out.println(max);
// }
// }

// Дан массив nums = [3,2,2,3,4,5,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// Вывод:
// [2,2,4,5,3,3,3]

// public class sem01_01 {
//     public static void main(String[] args) {
//         int[] array = new int[]{3,2,2,3,4,5,3};
//         int val = 3;
//         int temp;
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array.length-1; j++) {
//                 if (array[j] == val)
//                 {
//                     temp = array[j];
//                     array[j] = array[i];
//                     array[i] = temp;
//                 }            
//             }
//         }
//         System.out.println(Arrays.toString(array));
//     }
// }
// public class sem01_01 { //второй вариант решения 
//     public static void main(String[] args) {
//         int[] arr = new int[]{1,2,3,4,5,4,3,4};
//         // [1,2,4,5,4,4, 3,4 ]
//         int count = 0;

//         for (int i = 0; i < arr.length; i++)
//             if (arr[i] != 3) {
//                 arr[count++] = arr[i];
//             }
//         System.out.println(Arrays.toString(arr));
//         while (count < arr.length)
//             arr[count++] = 3;
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Дано четное число N (>0) и символы с1 и с2. Написать метод,
// который вернет строку длины N, которая состоит из чередующихся символов с1 и с2, начиная с с1.

// public class sem01_01 {
//     public static String builders(String a, String b, int N) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < N/2; i++) {
//             sb.append(a);
//             sb.append(b);
//         }
//         return sb.toString();

//     }

//     public static void main(String[] args) {
//         System.out.print("Введите число N: ");
//         Scanner iScanner = new Scanner(System.in);
//         int N = iScanner.nextInt();
//         String a = "c1", b = "c2";
//         System.out.printf(builders(a, b, N));
//         iScanner.close();
//     }

// }

// Напишите метод void, который сжимает строку. Пример: вход aaaabbbcddaa.
// результат - a4b3cd2a2

// public class sem01_01 {
//     public static void name(String N) {
//         StringBuilder sb = new StringBuilder();
//         int count = 1;
//         char temp = N.charAt(0);
//         sb.append(temp);
//         for (int i = 1; i < N.length(); i++) {
//             if (temp != N.charAt(i)) {
//                 if (count != 1) {
//                     sb.append(count);
//                     count = 1;
//                 }
//                 sb.append(N.charAt(i));
//                 temp = N.charAt(i);
//             } else {
//                 count += 1;
//             }
//         }
//         if (count != 1) {
//             sb.append(count);
//         }
//         System.out.print(sb.toString());

//     }

//     public static void main(String[] args) {
//         System.out.print("Введите число N: ");
//         Scanner iScanner = new Scanner(System.in);
//         String N = iScanner.nextLine();
//         name(N);
//         iScanner.close();
//     }
// }

// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

// public class sem01_01 {
//     public static boolean name(String N) {
//         for (int i = 0; i < N.length() / 2; i++) {
//             if (N.charAt(i) != N.charAt(N.length() - i - 1)) {
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static void main(String[] args) {
//         System.out.print("Введите строку: ");
//         Scanner iScanner = new Scanner(System.in);
//         String N = iScanner.nextLine();
//         System.out.print(name(N));
//         iScanner.close();
//     }
// }

public class sem01_01 {
    public static void main(String[] args) {
        File test = new File("test.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("test ");
        }
        try{
        FileWriter fr = new FileWriter(test, true);
        fr.write(sb.toString());
        fr.close();
        }
        catch(IOException e){
            System.out.println("Error");
        }

    }
}