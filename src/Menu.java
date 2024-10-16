import java.util.Scanner;

public class Menu {
    final private Catalogue catalogue;
    final Scanner scanner;

    public Menu() {
        this.catalogue = new Catalogue();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Welcome to the shop!");
        System.out.println("1. Add product");
        System.out.println("2. List all products");
        System.out.println("3. Exit");
        System.out.println("Enter: ");
        String input = scanner.nextLine();
        switch (input) {
            case "1": {
                catalogue.addProduct();
            }
            case "2": {
                //TODO add list method
            }
            case "3": {
                break;
            }
            default: {
                System.out.println("Invalid input, try again.");
            }
        }
    }
}
