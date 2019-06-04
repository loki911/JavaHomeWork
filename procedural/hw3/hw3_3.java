/**
 *        Заданы 2 массива целых чисел произвольной длины.
 *        Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных.
 *        Пример:
 *        1-й массив: {1, 2, 3, 4, 5}
 *        2-й массив: {5, 6, 7}
 *        Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */

import java.util.Arrays;

public class hw3_3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        System.out.println("1 массив: " + Arrays.toString(array1));
        System.out.println("2 массив: " + Arrays.toString(array2));
        int[] array3 = arraysUnited(array1, array2);
        System.out.println("Объединенный массив: " + Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("Отсортированный массив: " + Arrays.toString(array3));

    }

    static int[] arraysUnited (int[]array1, int[]array2) {
        int lengthFirst = array1.length;
        int lengthSecond = array2.length;
        int lengthRezult = lengthFirst + lengthSecond;
        int[] rezult = new int[lengthRezult];
        int a = 0, b = 0;
        while (a < lengthRezult) {
            if (b < lengthFirst) {
                rezult[a++] = array1[b];
            }
            if (b < lengthSecond) {
                rezult[a++] = array2[b];
            }
            b++;
        }
        return rezult;
    }
}
