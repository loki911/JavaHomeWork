/**
 *  Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */

import java.util.Scanner;

public class hw41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String inputString = sc.next();
        System.out.println("Введенное слово " + (isPalindrome(inputString)
                ? "является" : "НЕ является") + " палиндромом");
    }

    static boolean isPalindrome (String a) {
        String invertedString = "";
        for (int size = a.length(), i = size - 1; i >= 0; i--){
            invertedString += a.charAt(i);
        }
        return a.equalsIgnoreCase(invertedString);
    }
}
