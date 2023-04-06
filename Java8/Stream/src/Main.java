import java.util.List;

public class Main {

    static List<Product> products = List.of(new Product(1, "Laptop", 1000f), new Product(2, "Pendrive", 100f),
            new Product(3, "Hardisk", 300f));

    public static void main(String[] args) throws Exception {
        // filterExample();
        // mapExample();
        sortedExample();
    }

    public static void sortedExample() {
        System.out.println("Sorting example");
        products.stream()
                .sorted((product1, product2) -> product1.getRate() < product2.getRate() ? -1 : 1)
                .forEach(System.out::println);
    }

    public static void filterExample() {
        System.out.println("Filter Example:");
        products.stream().filter(product -> product.getRate() > 500).forEach(System.out::println);
    }

    public static void mapExample() {

        System.out.println("Map Example:");
        products.stream().map(product -> {
            product.setRate(product.getRate() + 500);
            return product;
        }).forEach(System.out::println);
    }

}

class Product {
    private int id;
    private String name;
    private float rate;

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", rate=" + rate + "]";
    }

    public Product(int id, String name, float rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

}
