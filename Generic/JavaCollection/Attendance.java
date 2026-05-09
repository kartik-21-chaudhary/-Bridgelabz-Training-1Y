import java.util.*;

class Attendance {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);

        List<String> day = Arrays.asList("A", "C");

        for (String s : day) {
            map.put(s, map.get(s) + 1);
        }

        for (String s : map.keySet()) {

            if (map.get(s) < 1) {
                System.out.println(s);
            }
        }
    }
}