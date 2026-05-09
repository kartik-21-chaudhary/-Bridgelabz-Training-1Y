import java.util.*;

class Library {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("101", "Java");
        map.put("102", "Python");

        String isbn = "101";

        if (map.containsKey(isbn)) {
            System.out.println(map.get(isbn));
        }

        map.remove("102");

        for (String k : map.keySet()) {
            System.out.println(k + " " + map.get(k));
        }
    }
}