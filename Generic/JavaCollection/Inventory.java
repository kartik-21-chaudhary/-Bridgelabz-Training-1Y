import java.util.*;

class Inventory {

    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        stock.put("Milk", 10);
        stock.put("Bread", 5);

        stock.put("Milk", stock.get("Milk") - 10);

        if (stock.get("Milk") <= 0) {
            stock.remove("Milk");
        }

        stock.put("Bread", stock.getOrDefault("Bread", 0) + 5);

        System.out.println(stock.getOrDefault("Milk", 0));
    }
}