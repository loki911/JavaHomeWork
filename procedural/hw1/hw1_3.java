package hw_1;

import java.util.Scanner;

public class Func_3 {

    public static void main(String[] args) {

        /* Написать программу, вычисляющую корни квадратного уравнения вида ax² + bx + c = 0,
       где a, b и c - вводимые пользователем из консоли данные. Учитывать только реальные корни
       (в случае отрицательного дискриминанта выводить сообщение пользователю).
       При решении создать и использовать следующие вынесенные функции:
       функция isPositive, определяющая, является ли число положительным,
       функция isZero, определяющая, является ли число нулём
       функция discriminant, вычисляющая дискриминант*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("имеется уравнение вида ax² + bx + c = 0");
        System.out.println("введите a:");
        int a = scanner.nextInt();
        System.out.println("введите b:");
        int b = scanner.nextInt();
        System.out.println("введите c:");
        int c = scanner.nextInt();
        double d = discriminant (a, b, c);
        if (c>=0) {
            System.out.println("введено уравнение " + a + "x²+" + b + "x+" + c + "=0");
        } else {
            System.out.println("введено уравнение " + a + "x²+" + b + "x" + c + "=0");
        }

        if (isZero(d)) {
            double root1 = (b * (-1) + Math.sqrt(d)) / (2 * a);
            System.out.println("дискриминант =0, уравнение имеет один корень:");
            System.out.println("х1=:" + root1);
        }
        else if (!isPositive(d)) {
            System.out.println("дискриминант <0, уравнение не имеет вещественных корней");
        }
        else {
            double root1 = (b*(-1)+Math.sqrt(d))/(2*a);
            double root2 = (b*(-1)-Math.sqrt(d))/(2*a);
            System.out.println("дискриминант >0, уравнение имеет два вещественных корня:");
            System.out.println("х1="+root1);
            System.out.println("х2="+root2);
        }
    }
    static boolean isPositive(double positive) {
        return (positive>0);
    }
    static boolean isZero(double zero) {
        return (zero==0);
    }
    static double discriminant (int a, int b, int c) {
        return (b*b-4*a*c);
    }
}
