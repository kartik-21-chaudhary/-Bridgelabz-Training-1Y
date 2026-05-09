import java.util.*;

class Package {

    String id;

    Package(String id) {
        this.id = id;
    }
}

class Delivery {

    public static void main(String[] args) {

        Queue<Package> pending = new LinkedList<>();

        Set<String> ids = new HashSet<>();

        List<Package> delivered = new ArrayList<>();

        Stack<Package> returned = new Stack<>();

        Package p = new Package("P1");

        if (ids.add(p.id)) {
            pending.add(p);
        }

        delivered.add(p);

        returned.push(p);

        System.out.println(delivered);
    }
}