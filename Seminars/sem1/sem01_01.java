// import java.util.Deque;
// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Map;
// import java.util.Scanner;
// import java.util.Stack;

// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//  Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
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

// public class sem01_01 {
//     public static void main(String[] args) {
//         File test = new File("test.txt");
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < 10; i++) {
//             sb.append("test ");
//         }
//         try{
//         FileWriter fr = new FileWriter(test, true);
//         fr.write(sb.toString());
//         fr.close();
//         }
//         catch(IOException e){
//             System.out.println("Error");
//         }

//     }
// }

//Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
// public class sem01_01 {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         Random rand = new Random();
//         for (int i = 0; i < 10; i++) {
//             int x = rand.nextInt(10);
//             arr.add(x);
//         }    
//         System.out.println(arr);
//         arr.sort(null);
//         System.out.println(arr);
//     }
// }

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

// public class sem01_01 {
//     public static void main(String[] args) {
//         ArrayList<String> arr = new ArrayList<>(Arrays.asList("Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter",
//                 "Saturn", "Uranus", "Neptune", "Pluto", "Sun", "Mercury", "Venus", "Earth", "Mars"));
//         ArrayList<String> arr_2 = new ArrayList<>();
//         for (int i = 0; i < arr.size(); i++) {
//             if (!arr_2.contains(arr.get(i))) {
//                 int count = 0;
//                 arr_2.add(arr.get(i));
//                 for (int j = 0; j < arr.size(); j++) {
//                     if (arr.get(i).equals(arr.get(j))) {
//                         count += 1;
//                     }
//                 }
//                 System.out.println(arr.get(i)+" "+count);
//             }

//         }
//     }
// }

// Создать список типа ArrayList.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
// static void ex3(){
//     ArrayList list = new ArrayList<>();
//     list.add("asdad5");
//     list.add("asdad4");
//     list.add("asdad3");
//     list.add(22);
//     list.add(22);
//     list.add(22);
//     list.add("asdad2");
//     list.add("asdad1");
//     list.add(22);

//     System.out.println(list);
//     for (int i = list.size()-1; i >= 0; i--) {
//         if (list.get(i) instanceof Integer){
//             list.remove(i);

//         }
//     }
//     System.out.println(list);
// }

// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

//import java.util.ArrayList;
// import java.util.LinkedList;

// public class sem01_01 {

// public static void main(String[] args) {
// long timeStart_1 = System.currentTimeMillis();
// ArrayList<Integer> resulList = new ArrayList<>();
// for (int i = 0; i < 1000000; i++) {
// resulList.add(i);
// }
// long timeFinish_1 = System.currentTimeMillis();
// long timeStart_2 = System.currentTimeMillis();
// LinkedList<Integer> listlink = new LinkedList<>();
// for (int i = 0; i < 1000000; i++) {
// listlink.add(i);
// }
// long timeFinish_2 = System.currentTimeMillis();
// System.out.printf("The time = %d \n" ,timeFinish_1 - timeStart_1);
// System.out.printf("The time = %d \n",timeFinish_2 - timeStart_2);
// }
// }

//     Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text
// 1. Нужно сохранить text в связный список
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// asd
// [asd]
// dfhj
// [asd, dfhj]
// xzcv
// [asd, dfhj, xzcv]
// print~1
// Вывод dfhj
// [asd, xzcv]

// import java.util.Scanner;

// import java.util.LinkedList;
// import java.util.Scanner;

// import javax.sql.rowset.serial.SQLOutputImpl;

// public class sem01_01 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         LinkedList<String> listLink = new LinkedList<>();
//         System.out.println("Enter string: ");
//         String str = scn.nextLine();
//         while (!str.equals("stop")) {
//             if (!str.contains("print~")) {
//                 listLink.add(str);
//             } else {
//                 String st = str.substring(3);
//                 System.out.println(st);
//                 int index = Integer.parseInt(st);
//                 System.out.println(listLink.get(index));
//                 listLink.remove(index);
//             }
//             System.out.print(listLink.toString());
//             System.out.println("Enter new string: ");
//             str = scn.nextLine();
//         }
//         scn.close();
//     }
// }

// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.Scanner;

// public class sem01_01 {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// Deque <String> queue = new LinkedList<String>();

// System.out.println("Enter string: ");
// String str = scn.nextLine();
// while (! str.contains("print")) {
// queue.add(str);
// System.out.print(queue.toString());
// System.out.println("Enter new string: ");
// str = scn.nextLine();
// }
// while(! queue.isEmpty()) {
// System.out.println(queue.pollLast());
// }
// System.out.print(queue.toString());
// scn.close();
// }
// }

// import java.util.HashMap;
// import java.util.Map;
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
// public class sem01_01 {
//     public static void main(String[] args) {
//         Map<Integer, String> data = new HashMap<>();
//         data.put(123456, "Иванов");
//         data.put(321456, "Васильев");
//         data.put(234561, "Петрова");
//         data.put(234432, "Иванов");
//         data.put(654321, "Петрова");
//         data.put(345678, "Иванов");
//         for (var element : data.entrySet()) {
//             System.out.printf("key: %s; value: %s \n", element.getKey(), element.getValue());
//         }

//         for (var element : data.entrySet()) {
//             if (element.getValue().equals("Иванов")) {
//                 System.out.println(element.getKey());
//             }
//         }
//     }
// }

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// public class sem01_01 {
//     static boolean isIsomorpf(String strFirst, String strSecond) {
//         if (strFirst.length() != strSecond.length()) {
//             return false;
//         }
//         Map<Character, Character> data = new HashMap<>();
//         for (int i = 0; i < strFirst.length(); i++) {
//             if (!data.containsKey(strFirst.charAt(i))) {
//                 data.put(strFirst.charAt(i), strSecond.charAt(i));
//             } else {
//                 if (data.get(strFirst.charAt(i)) != strSecond.charAt(i)) {
//                     return false;
//                 }
//             }
//             return true;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter first word!: ");
//         String strFist = scn.nextLine();
//         System.out.println("Enter second word!: ");
//         String strSecond = scn.nextLine();
//         if (isIsomorpf(strFist, strSecond)) {
//         }
//     }
// }

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// public class sem01_01 {
//     static boolean ex2(String s) {
//         char[] chars = s.toCharArray();
//         Stack<Character> stack = new Stack<>();
//         Map<Character, Character> map = new HashMap<>();
//         String[] c1 = new String[] { "()", "{}", "[]", "<>" };
//         for (int i = 0; i < c1.length; i++) {
//             String a = c1[i];
//             map.put(a.charAt(1), a.charAt(0));
//         }
//         for (int i = 0; i < chars.length; i++) {
//             if (map.containsValue(chars[i])) {
//                 stack.push(chars[i]);
//             }
//             if (map.containsKey(chars[i])) {
//                 if (stack.empty() || map.get(chars[i]) != stack.pop()) {
//                     return false;
//                 }
//             }
//         }
//         return stack.empty();
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter first word!: ");
//         String str = scn.nextLine();
//         scn.close();
//         System.out.println(ex2(str));
//     }
// }