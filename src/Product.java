public class Product {
    private String name;
    private double price;
    private int dupp;

    public Product(String plupp, int dupp) {
        this.name = plupp;
        this.dupp = dupp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
