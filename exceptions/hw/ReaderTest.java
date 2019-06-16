package exceptions;

import java.util.List;

public class ReaderTest {
    public static void main(String[] args) {

        List<Double> list = new Reader().readValues();
        System.out.println(list);
        System.out.println(Reader.sumOfValues(list));

    }
}
