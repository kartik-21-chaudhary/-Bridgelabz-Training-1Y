class Cart<T> {

    java.util.List<T> items = new java.util.ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void removeItem(T item) {
        items.remove(item);
    }

    void displayItems() {
        System.out.println(items);
    }
}

class Main9 {

    public static void main(String[] args) {

        Cart<String> electronics = new Cart<>();
        electronics.addItem("Mobile");
        electronics.displayItems();

        Cart<String> clothes = new Cart<>();
        clothes.addItem("Shirt");
        clothes.displayItems();
    }
}