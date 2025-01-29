package singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem inventory = new InventoryManagementSystem();
        inventory.addItemAtEnd("Tshirt", 1, 10, 999);
        inventory.addItemAtEnd("Shirt", 2, 20, 1299);

        System.out.println("Total value of inventory: " + inventory.calculateTotalValue());

        inventory.sortInventoryByName(true);
        System.out.println("Sorted inventory by name in ascending order:");
        Item current = inventory.head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }

        inventory.sortInventoryByPrice(false);
        System.out.println("Sorted inventory by price in descending order:");
        current = inventory.head;
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Item ID: " + current.itemId + ", Quantity: " + current.quantity + ", Price: " + current.price);
            current = current.next;
        }
    }
}
