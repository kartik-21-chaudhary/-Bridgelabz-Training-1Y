class Product {

    double price;

    Product(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}

class Mobile extends Product {

    Mobile(double price) {
        super(price);
    }
}

class Laptop extends Product {

    Laptop(double price) {
        super(price);
    }
}

class PriceUtil {

    static double calculateTotal(java.util.List<? extends Product> items) {

        double total = 0;

        for (Product p : items) {
            total += p.getPrice();
        }

        return total;
    }
}

class Main10 {

    public static void main(String[] args) {

        java.util.List<Mobile> list =
                java.util.Arrays.asList(new Mobile(1000), new Mobile(2000));

        System.out.println(PriceUtil.calculateTotal(list));
    }
}