import java.util.*;

class Product {

    String name;
    int stock;

    Product(String n, int s) {
        name = n;
        stock = s;
    }
}

class Inventory {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        List<Product> products = new ArrayList<>();

        Queue<Product> restock = new LinkedList<>();

        Stack<Product> undo = new Stack<>();

        Product p = new Product("Milk", 2);

        names.add(p.name);
        products.add(p);

        if (p.stock < 5) {
            restock.add(p);
        }

        while (!restock.isEmpty()) {

            Product pr = restock.remove();
            pr.stock += 10;
            undo.push(pr);
        }

        System.out.println("Undo restock " + undo.pop().name);
    }
}