class Item {
    int itemCode;
    String itemName;
    double price;
    void displayDetails(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
    public static void main(String[] args) {
        Item i1 = new Item();
        i1.itemCode = 201;
        i1.itemName = "Laptop";
        i1.price = 50000;
        i1.displayDetails(2);
    }
}