public class Product {
    private String title;
    private double price;
private boolean isGood;
    private String type;

    public Product(String title, double price, String type, boolean isGood) {
        this.title = title;
        this.price = price;
        this.type = type;
        this.isGood = isGood;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product" +
                "\nName: " + title +
                "\nPrice: " + price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
