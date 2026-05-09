import java.util.*;

class SentenceFreq {

    public static void main(String[] args) {

        String text = "Java is fun and Java is powerful";

        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        System.out.println(map);
    }
}