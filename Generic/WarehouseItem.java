abstract class WarehouseItem {
}

class Electronics extends WarehouseItem {
}

class Groceries extends WarehouseItem {
}

class Furniture extends WarehouseItem {
}

class Storage<T extends WarehouseItem> {

    java.util.List<T> items = new java.util.ArrayList<>();

    void add(T item) {
        items.add(item);
    }

    static void showAll(java.util.List<? extends WarehouseItem> list) {

        for (WarehouseItem i : list) {
            System.out.println(i);
        }
    }
}

class Main12 {

    public static void main(String[] args) {

        Storage<Electronics> storage = new Storage<>();

        storage.add(new Electronics());

        Storage.showAll(storage.items);
    }
}