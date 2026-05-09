import java.util.*;

class RideRequest {

    int priority;

    RideRequest(int p) {
        priority = p;
    }
}

class Driver {

    String name;

    Driver(String n) {
        name = n;
    }
}

class RideSystem {

    public static void main(String[] args) {

        PriorityQueue<RideRequest> pq =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        pq.add(new RideRequest(5));
        pq.add(new RideRequest(2));

        Set<Driver> drivers = new HashSet<>();

        drivers.add(new Driver("A"));

        List<RideRequest> completed = new ArrayList<>();

        while (!pq.isEmpty()) {

            RideRequest r = pq.remove();

            System.out.println("Assigned ride " + r.priority);

            completed.add(r);
        }
    }
}