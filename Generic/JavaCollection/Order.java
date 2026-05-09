import java.util.*;

class Order {

    int id;

    Order(int id) {
        this.id = id;
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object o) {
        return this.id == ((Order) o).id;
    }

    public String toString() {
        return "Order " + id;
    }
}

class ECommerce {

    public static void main(String[] args) {

        List<Order> allOrders = new ArrayList<>();

        allOrders.add(new Order(1));
        allOrders.add(new Order(2));
        allOrders.add(new Order(1));

        Set<Order> unique = new HashSet<>(allOrders);

        Queue<Order> queue = new LinkedList<>(unique);

        Stack<Order> failed = new Stack<>();

        while (!queue.isEmpty()) {

            Order o = queue.remove();

            if (o.id == 2) {
                failed.push(o);
            } else {
                System.out.println("Processed " + o);
            }
        }

        while (!failed.isEmpty()) {
            System.out.println("Retry " + failed.pop());
        }
    }
}