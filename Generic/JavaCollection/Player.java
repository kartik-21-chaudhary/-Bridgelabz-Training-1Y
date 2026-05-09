import java.util.*;

class Player implements Comparable<Player> {

    String name;
    int score;

    Player(String n, int s) {
        name = n;
        score = s;
    }

    public int compareTo(Player p) {
        return p.score - this.score;
    }

    public String toString() {
        return name + " " + score;
    }
}

class Tournament {

    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();

        players.add(new Player("A", 50));
        players.add(new Player("B", 70));

        Queue<String> matches = new LinkedList<>();

        matches.add("Match1");

        List<String> results = new ArrayList<>();

        TreeSet<Player> leaderboard = new TreeSet<>(players);

        System.out.println(leaderboard);
    }
}