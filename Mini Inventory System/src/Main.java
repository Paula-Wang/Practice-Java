import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();

        Product item1 = new Product("Notebook", 10, 2.50);
        Product item2 = new Product("Pen", 20, 0.99);
        Product item3 = new Product("Marker", 15, 1.75);

        inventory.add(item1);
        inventory.add(item2);
        inventory.add(item3);

        System.out.println("=== Inventory List ===");
        for (Product item : inventory) {
            item.displayProduct();
        }
    }
}