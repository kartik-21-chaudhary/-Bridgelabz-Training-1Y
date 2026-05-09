class ProductCat<T> {

    T category;
    double price;

    ProductCat(T category, double price) {
        this.category = category;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }
}

class Market {

    static <T extends ProductCat<?>> void applyDiscount(
            T product,
            double percent) {

        double newPrice = product.getPrice() * (1 - percent / 100);

        product.setPrice(newPrice);
    }
}

class Main13 {

    public static void main(String[] args) {

        ProductCat<String> p = new ProductCat<>("Book", 100);

        Market.applyDiscount(p, 10);

        System.out.println(p.getPrice());
    }
}