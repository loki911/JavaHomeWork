import java.util.Scanner;

import static java.lang.Math.max;

public class Func_2 {
    public static void main(String[] args) {

        /*Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
        Проверить, помещаются ли эти дома на участке размерами e на f. Стороны домов - параллельны сторонам участка,
        в остальном размещение может быть любым.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размеры первого дома");
        System.out.print("введите a:");
        int a = scanner.nextInt();
        System.out.print("введите b:");
        int b = scanner.nextInt();
        System.out.println("введите размеры второго дома");
        System.out.print("введите c:");
        int c = scanner.nextInt();
        System.out.print("введите d:");
        int d = scanner.nextInt();
        System.out.println("введите размеры участка");
        System.out.print("введите e:");
        int e = scanner.nextInt();
        System.out.print("введите f:");
        int f = scanner.nextInt();

        boolean case1 = max(a,c)<=e && (b+d) <=f;
        boolean case2 = max(a,c)<=f && (b+d) <=e;
        boolean case3 = max(a,d)<=e && (b+c) <=f;
        boolean case4 = max(a,d)<=f && (b+c) <=e;
        boolean case5 = max(b,d)<=e && (a+c) <=f;
        boolean case6 = max(b,d)<=f && (a+c) <=e;
        boolean case7 = max(b,c)<=e && (a+d) <=f;
        boolean case8 = max(b,c)<=f && (a+d) <=e;

        boolean fit = case1 | case2 | case3 | case4 | case5 | case6 | case7 | case8;
        if (fit) {System.out.print("дома поместятся на участке");}
        else {System.out.print("дома не поместятся на участке");}
    }
}