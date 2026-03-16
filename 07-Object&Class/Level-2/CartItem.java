class CartItem {
    String itemName;
    int price;
    int quantity;
    CartItem(String name, int p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }
    void addItem(int q) {
        quantity = quantity + q;
        System.out.println("Item Added. Quantity = " + quantity);
    }
    void removeItem(int q) {
        if (quantity >= q) {
            quantity = quantity - q;
            System.out.println("Item Removed. Quantity = " + quantity);
        } else {
            System.out.println("Not enough items to remove");
        }
    }
    void totalCost() {
        int total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        CartItem c = new CartItem("Shoes", 1000, 2);
        c.addItem(1);
        c.removeItem(1);
        c.totalCost();
    }
}