import java.util.Scanner;

public class Func_5 {
    public static void main(String[] args) {

        /* Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем
         целого числа.
         Решить двумя способами:
         с помощью цикла
         с помощью рекурсии.*/

        System.out.println("введите число");

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextDouble()) {
            System.out.println("введено некорректное значение");
            scanner.next();
    }

            double number = scanner.nextDouble();
            int a = 0;
            int b = 1;
            int c;
            int d = 0;

            for (d = 0; a < number; d++) {
                System.out.println(a);
                c = a;
                a = a + b;
                b = c;

            }
        }
    }

