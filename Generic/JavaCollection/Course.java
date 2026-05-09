import java.util.*;

class Course {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 50);
        map.put("CS102", 3);

        map.put("CS101", map.get("CS101") + 1);

        for (String c : map.keySet()) {

            if (map.get(c) >= 50) {
                System.out.println("Full: " + c);
            }

            if (map.get(c) < 5) {
                System.out.println("Low: " + c);
            }
        }
    }
}