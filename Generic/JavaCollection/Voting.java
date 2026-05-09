import java.util.*;

class Voting {

    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] arr = {"A", "B", "A", "C", "A", "B", "C", "A", "B", "A"};

        for (String v : arr) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        String winner = null;
        int max = 0;

        for (String k : votes.keySet()) {

            if (votes.get(k) > max) {
                max = votes.get(k);
                winner = k;
            }
        }

        System.out.println(votes);
        System.out.println("Winner: " + winner);
    }
}