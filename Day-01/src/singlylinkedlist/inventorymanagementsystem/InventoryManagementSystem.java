package singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementSystem {
    public Item head;

    // Constructor
    public InventoryManagementSystem() {
        this.head = null;
    }

    // Adds an item at the beginning of the linked list
    public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Adds an item at the end of the linked list
    public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
    }
    // Adds an item at a specific position in the linked list
    public void addItemAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (position == 0) {
            newItem.next = head;
            head = newItem;
        } else {
            Item current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newItem.next = current.next;
                current.next = newItem;
            }
        }
    }

    // Removes an item by its ID
    public void removeItemById(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item current = head;
        while (current.next != null && current.next.itemId != itemId) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Updates the quantity of an item by its ID
    public void updateQuantityById(int itemId, int newQuantity) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
    }

    // Searches for an item by its ID
    public Item searchById(int itemId) {
        Item current = head;
        while (current != null) {
            if (current.itemId == itemId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Searches for an item by its name
    public Item searchByName(String itemName) {
        Item current = head;
        while (current != null) {
            if (current.itemName.equals(itemName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    // Calculates the total value of all items in the inventory
    public double calculateTotalValue() {
        double totalValue = 0;
        Item current = head;
        while (current != null) {
            totalValue += current.price * current.quantity;
            current = current.next;
        }
        return totalValue;
    }

    // Sorts the inventory by item name in ascending or descending order
    public void sortInventoryByName(boolean ascending) {
        head = mergeSort(head, (a, b) -> ascending ? a.itemName.compareTo(b.itemName) : b.itemName.compareTo(a.itemName));
    }
    // Sorts the inventory by item price in ascending or descending order
    public void sortInventoryByPrice(boolean ascending) {
        head = mergeSort(head, (a, b) -> ascending ? Double.compare(a.price, b.price) : Double.compare(b.price, a.price));
    }

    // Performs merge sort on the linked list
    private Item mergeSort(Item head, java.util.Comparator<Item> comparator) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSort(head, comparator);
        Item right = mergeSort(nextOfMiddle, comparator);
        return sortedMerge(left, right, comparator);
    }

    // Finds the middle of the linked list
    private Item getMiddle(Item head) {
        if (head == null) {
            return head;
        }
        Item slow = head, fast = head.next;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    // Merges two sorted linked lists
    private Item sortedMerge(Item a, Item b, java.util.Comparator<Item> comparator) {
        if (a == null) return b;
        if (b == null) return a;
        Item result;
        if (comparator.compare(a, b) <= 0) {
            result = a;
            result.next = sortedMerge(a.next, b, comparator);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, comparator);
        }
        return result;
    }
}

