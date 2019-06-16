package patterns;

import java.util.Arrays;
import java.util.List;

public class TestStrategy {
    public static void main(String[] args) {
        Product product1 = new Product("Beer", 1, 2);
        Product product2 = new Product("Vodka", 4, 6);
        Product product3 = new Product("Whiskey", 12, 20);
        Product product4 = new Product("Tequila", 10, 15);


        List<Product> products = Arrays.asList(product1, product2, product3, product4);
        Service service = new Service(products);

        System.out.println(service.filter(new FilterByName("eq")));
        System.out.println(service.filter(new FilterByPrice(13)));
    }
}
