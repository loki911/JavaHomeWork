package patterns;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private List<Product> products;

    public Service(List<Product> products) {
        this.products = products;
    }

    public List<Product> filter(Strategy filterStrategy) {
        return products.stream()
                .filter(product -> filterStrategy.filter(product))
                .collect(Collectors.toList());
    }
}
