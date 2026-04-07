class Order implements Runnable {
    int id;
    String restaurant;
    int time;
    int priority;
    Order(int id, String restaurant, int time, int priority) {
        this.id = id;
        this.restaurant = restaurant;
        this.time = time;
        this.priority = priority;
    }
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println("Order " + id + " picked up by " + Thread.currentThread().getName());
        try { Thread.sleep(time * 1000); } catch (Exception e) {}
        System.out.println("Order " + id + " in transit...");
        try { Thread.sleep(time * 1000); } catch (Exception e) {}
        System.out.println("Order " + id + " delivered!");
        long end = System.currentTimeMillis();
        System.out.println("Total delivery time: " + (end - start) + " ms");
    }
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "KFC", 2, 10), "Agent1");
        Thread o2 = new Thread(new Order(2, "Dominos", 3, 5), "Agent2");
        Thread o3 = new Thread(new Order(3, "Burger King", 4, 3), "Agent3");
        Thread o4 = new Thread(new Order(4, "Pizza Hut", 2, 10), "Agent4");
        Thread o5 = new Thread(new Order(5, "Subway", 3, 5), "Agent5");
        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(10);
        o5.setPriority(5);
        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}