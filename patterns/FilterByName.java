package patterns;

public class FilterByName implements Strategy{

    private final String name;

    public FilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean filter(Product product) {
        return product.getName().toLowerCase().contains(this.name.toLowerCase());
    }
}
