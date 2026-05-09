import java.util.*;

class Salary {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("A", 5000.0);
        map.put("B", 7000.0);

        map.put("A", map.get("A") * 1.1);

        double sum = 0;
        double max = 0;
        String top = "";

        for (String e : map.keySet()) {

            double sal = map.get(e);

            sum += sal;

            if (sal > max) {
                max = sal;
                top = e;
            }
        }

        System.out.println("Avg: " + sum / map.size());
        System.out.println("Top: " + top);
    }
}