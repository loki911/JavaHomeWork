/**
 *    Написать функцию linearize, которая принимает в качестве параметра двумерный массив
 *    и возвращает одномерный массив со всеми элементами двумерного.
 */

import java.util.Arrays;

public class hw3_4 {
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        System.out.println("Введенный массив:");
        for (int[] i : input) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Итоговый массив: " + Arrays.toString(linearize(input)));
    }

    static int[] linearize(int[][] a) {
        int size = a.length;
        for(int i = 0; i < size; i++){
            count1 += a[i].length;
        }
        int[] rezult = new int[count1];
        for(int i = 0; i < size; i++) {
            if(i == 0) {
                System.arraycopy(a[0], 0, rezult, 0, a[0].length);
                count2 = a[0].length;
                continue;
            }
            System.arraycopy(a[i], 0, rezult, count2, a[i].length);
            count2 += a[i].length;
        }
        return rezult;
    }
}
