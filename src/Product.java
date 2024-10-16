public class Product {
    private String title;
    private double price
    private String type;

    public Product(String title, double price, String type) {
        this.title = title;
        this.price = price;
        this.type = type;
     

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price*55;
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
