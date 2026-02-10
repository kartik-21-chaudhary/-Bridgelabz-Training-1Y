package Level2;
import java.util.Scanner;

class RockPaperScissors {
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String winner(String u, String c) {
        if (u.equals(c)) return "Draw";
        if (u.equals("rock") && c.equals("scissors")) return "User";
        if (u.equals("paper") && c.equals("rock")) return "User";
        if (u.equals("scissors") && c.equals("paper")) return "User";
        return "Computer";
    }

    static String[][] stats(int u, int c, int t) {
        String[][] r = new String[2][3];
        r[0][0] = "User";
        r[0][1] = String.valueOf(u);
        r[0][2] = String.valueOf((u * 100) / t);

        r[1][0] = "Computer";
        r[1][1] = String.valueOf(c);
        r[1][2] = String.valueOf((c * 100) / t);

        return r;
    }

    static void display(String[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1] + "\t" + a[i][2] + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int uw = 0, cw = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String w = winner(user, comp);
            if (w.equals("User")) uw++;
            else if (w.equals("Computer")) cw++;
        }

        String[][] r = stats(uw, cw, games);
        display(r);
    }
}
