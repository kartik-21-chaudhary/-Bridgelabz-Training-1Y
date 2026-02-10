package Level2;
import java.util.Scanner;

class ShortLongWord {
    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
            return c;
        }
    }

    static String[] splitWords(String s) {
        int len = findLength(s);
        int w = 1;
        for (int i = 0; i < len; i++)
            if (s.charAt(i) == ' ') w++;

        int[] idx = new int[w + 1];
        idx[0] = -1;
        int k = 1;
        for (int i = 0; i < len; i++)
            if (s.charAt(i) == ' ') idx[k++] = i;
        idx[k] = len;

        String[] words = new String[w];
        for (int i = 0; i < w; i++) {
            String t = "";
            for (int j = idx[i] + 1; j < idx[i + 1]; j++)
                t += s.charAt(j);
            words[i] = t;
        }
        return words;
    }

    static String[][] make2D(String[] w) {
        String[][] a = new String[w.length][2];
        for (int i = 0; i < w.length; i++) {
            a[i][0] = w[i];
            a[i][1] = String.valueOf(findLength(w[i]));
        }
        return a;
    }

    static int[] shortLong(String[][] a) {
        int min = Integer.parseInt(a[0][1]);
        int max = Integer.parseInt(a[0][1]);
        for (int i = 1; i < a.length; i++) {
            int v = Integer.parseInt(a[i][1]);
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] w = splitWords(text);
        String[][] table = make2D(w);
        int[] r = shortLong(table);

        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}

