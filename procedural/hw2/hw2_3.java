import java.util.Scanner;

public class func_6 {
    public static void main(String[] args) {

    /*Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
    Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
    Программа должна выводить:
    a. Количество дней
    b. Сумму осадков за этот период
    c. Среднее количество осадков за этот период
    d. Максимальное количество дневных осадков за этот период
    Не использовать массивы!*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число дней N");
        while (!scanner.hasNextInt()) {
            System.out.println("введено некорректное значение. Введите число дней N");
            scanner.next();}

        int number = scanner.nextInt();

            double b = 0;
            double summ = 0;
            double max = 0;
            for (int a = 0; a < number; a++) {

                System.out.println("Введите количество осадков в " + (a + 1) + " день");

                while (!scanner.hasNextDouble()) {
                    System.out.println
                            ("введено некорректное значение. Введите количество осадков в " + (a + 1) + " день");
                    scanner.next();}
                b = scanner.nextDouble();
                summ = summ + b;
                if (max < b) max = b;

            }
            System.out.println("Количество дней равно: " + number);
        System.out.println("Сумма осадков за " + number + " дней равно: " + summ);
        System.out.println("Среднее количество осадков за " + number + " дней равно: " + (summ/number));
        System.out.println("Максимальное количество осадков за " + number + " дней равно: " + max);
    }
}
