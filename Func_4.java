import java.util.Scanner;

public class Func_4 {

    public static void main(String[] args) {

        /* Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.*/

        System.out.println("введите целое число");

            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
            System.out.println("введено некорректное значение");
            scanner.next();
        }
                int a = scanner.nextInt();
                int sum = 0;
                sum(a, sum);
            }
            static void sum(int a, int sum){
                if(a!=0){
                    sum+=a%10;
                    sum(a/10, sum);
                }
                else System.out.println("Сумма цифр введенного числа равна " + sum);
    }
}
