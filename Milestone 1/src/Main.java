import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Inventory managerInventory = new Inventory();
        StoreManager testStore = new StoreManager(managerInventory);
        Product p1 = new Product("ball", 1, 3.40);
        Product p2 = new Product("triangle", 2, 3.70);
        Product p3 = new Product("Computer", 3, 100);

        managerInventory.addStock(p1, 3);
        managerInventory.addStock(p2, 3);

        managerInventory.addStock(p3,1);
        managerInventory.addStock(p2, 2);
        managerInventory.addStock(p3,4);
        int ballStock = managerInventory.getStock(1);
        int triangleStock = managerInventory.getStock(2);
        int computerStock = managerInventory.getStock(3);

        String productName = managerInventory.getProductName(2);

        System.out.println("ball stock: "+ ballStock +", Triangle Stock: "+ triangleStock +
                ", Computer Stock: " + computerStock);
        System.out.println(productName);

        managerInventory.productInfo(1);
        managerInventory.productInfo(2);
        managerInventory.productInfo(3);

        // Create an order as a 2D array
        int[][] order1 = {{p1.getId(), 3}, {p2.getId(), 1}, {p3.getId(), 2}};

        System.out.println("Order: " + Arrays.deepToString(order1));

        System.out.println("Your total comes to: " + testStore.transaction(order1));

        managerInventory.productInfo(1);
        managerInventory.productInfo(2);
        managerInventory.productInfo(3);

        // Create an order to test the out of stock case
        int[][] order2 = {{p1.getId(), 1}, {p2.getId(), 1}, {p3.getId(), 2}};

        System.out.println("Order: " + Arrays.deepToString(order1));

        System.out.println("Your total comes to: " + testStore.transaction(order1));
    }
}