package patterns;

public class FilterByPrice implements Strategy{
    private Integer price;

    public FilterByPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean filter(Product product) {
        return this.price >= product.getListPrice() && this.price <= product.getSellingPrice();
    }
}
