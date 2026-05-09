import java.util.*;

class Product {

    String name;
    double price;
    double rating;
    double discount;

    Product(String n, double p, double r, double d) {
        name = n;
        price = p;
        rating = r;
        discount = d;
    }

    public String toString() {
        return name + " " + price + " " + rating + " " + discount;
    }
}

class SortProducts {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("A", 1000, 4.5, 10));
        list.add(new Product("B", 800, 4.8, 20));
        list.add(new Product("C", 1200, 4.2, 15));

        list.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sort by Price: " + list);

        list.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("Sort by Rating: " + list);

        list.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("Sort by Discount: " + list);
    }
}