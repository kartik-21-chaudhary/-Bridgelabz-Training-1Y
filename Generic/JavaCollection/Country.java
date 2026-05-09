import java.util.*;

class Country {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington");

        String input = "India";

        System.out.println(map.getOrDefault(input, "Unknown"));

        for (String c : map.keySet()) {
            System.out.println(c + " " + map.get(c));
        }
    }
}