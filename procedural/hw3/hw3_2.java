/**
 *  Написать программу, принимающую массив целых чисел, в котором м.б. повторения,
 *  и возвращающую новый массив без повторяющихся числел, и печатающую результат.
 *  В результирующем массиве не должно быть дубликатов.
 */

import java.util.Arrays;

public class hw3_2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,4,5,6,7,5,6,7,8};
        System.out.println("Введенный массив: " + Arrays.toString(array));
        System.out.println("Итоговый массив: " + Arrays.toString(delete(array)));
    }

    static int[] delete(int[] start) {
        int[] move = new int[start.length];
        int d = 0;
        for (int i = 0, size = start.length; i < size; i++) {
            for (int j = i + 1, size2 = start.length; j < size2; j++) {
                if (start[j] == start[i]) {
                    move[j] = 1;
                    d++;
                    break;
                }
            }
        }
        int[] result = new int[start.length - d];
        int count = 0;
        for (int i = 0, size = move.length; i < size; i++) {
            if (move[i] == 0) {
                result[count++] = start[i];
            }
        }
        return result;
    }
}
