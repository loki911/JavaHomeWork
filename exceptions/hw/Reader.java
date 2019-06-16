package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static List<Double> readValues() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        ArrayList<Double> doubles = new ArrayList<>();
        for (int i = 0; i < line.split(" ").length; i++) {
            doubles.add(Double.valueOf(line.split(" ")[i]));
               }
               return doubles;
           }

           public static double sumOfValues(List<Double> list) throws NumberFormatException {
               double sum = 0;
               for (int i = 0; i < 2; i++) {
                   for (double number : readValues()) {
                       sum += number;
                   }
               }
               return sum;
           }
       }
