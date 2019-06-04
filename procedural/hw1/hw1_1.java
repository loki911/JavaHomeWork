import java.util.Scanner;

public class Func_1{

    public static void main(String[] args) {

        /* HW1) Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
        Вывести дату следующего дня в формате "День.Месяц.Год". Учесть переход на следующий месяц,
        а также следующий год. Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.*/

        Scanner scanner = new Scanner(System.in);
        boolean CorrectDate = false;
        while (!CorrectDate) {
            System.out.print("введите день:");
            int day = scanner.nextInt();
            System.out.print("введите месяц:");
            int month = scanner.nextInt();
            System.out.print("введите год:");
            int year = scanner.nextInt();

            boolean LeapYear = ((year % 4 == 0) & (year % 100 != 0) | (year % 400 == 0));
            int max[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (LeapYear) {
                max[1] = 29;
            }
            boolean CorrectMonth = ((month > 0) & (month < 13));
            if (CorrectMonth) { CorrectDate = (day <= max[month-1]);}
            if (!CorrectDate) {
                System.out.println("введена некорректная дата");
                return;
            } else {
                System.out.println("введена дата:" + date (day, month, year));}
            day++;
            if (day>max[month-1]) { day = 1; month++;
            if (month>12) { day = 1; month = 1; year++; System.out.println("следующий день:" + date(day, month, year));
                } else {System.out.println("следующий день:" + date(day, month, year));}

            } else {System.out.println("следующий день:" + date(day, month, year));}
        }
    }

    static String date(int d, int m, int y) {
        String output = d + "." + m + "." + y + "г.";
        return output;
    }
}
