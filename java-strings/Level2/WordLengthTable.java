package Level2;
import java.util.Scanner;

class WordLengthTable {
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
        int words = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ')
                words++;
        }

        int[] index = new int[words + 1];
        index[0] = -1;
        int k = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ')
                index[k++] = i;
        }
        index[k] = len;

        String[] result = new String[words];
        for (int i = 0; i < words; i++) {
            String w = "";
            for (int j = index[i] + 1; j < index[i + 1]; j++) {
                w += s.charAt(j);
            }
            result[i] = w;
        }
        return result;
    }

    static String[][] make2D(String[] words) {
        String[][] a = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            a[i][0] = words[i];
            a[i][1] = String.valueOf(findLength(words[i]));
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = make2D(words);

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}


