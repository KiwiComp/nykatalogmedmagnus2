public class Product {
    private String name;
    private double price;
private String temple;
    private String type;

    public Product(String name, double price, String type, String temple) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.temple = temple;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price*55;
    }

    @Override
    public String toString() {
        return "Product" +
                "\nName: " + name +
                "\nPrice: " + price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
