package Level2;
import java.util.Scanner;

class VotingTest {
    static int[] createAge(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = (int)(Math.random() * 90) - 10;
        return a;
    }

    static String[][] checkVote(int[] a) {
        String[][] r = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            r[i][0] = String.valueOf(a[i]);
            if (a[i] >= 18)
                r[i][1] = "true";
            else
                r[i][1] = "false";
        }
        return r;
    }

    static void display(String[][] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t" + a[i][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] age = createAge(n);
        String[][] r = checkVote(age);
        display(r);
    }
}

