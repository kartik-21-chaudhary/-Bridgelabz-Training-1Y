import java.util.*;

class Booking {

    String name;
    int priority;

    Booking(String n, int p) {
        name = n;
        priority = p;
    }
}

class Event {

    public static void main(String[] args) {

        Set<String> users = new HashSet<>();

        users.add("U1");

        Queue<Booking> queue = new LinkedList<>();

        PriorityQueue<Booking> vip =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        List<Booking> confirmed = new ArrayList<>();

        Booking b = new Booking("U1", 5);

        queue.add(b);
        vip.add(b);

        confirmed.add(vip.remove());

        System.out.println(confirmed);
    }
}