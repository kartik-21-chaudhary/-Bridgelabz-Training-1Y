package Level2;
import java.util.Scanner;
class SplitCompareTest {
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

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] a1 = splitWords(text);
        String[] a2 = text.split(" ");

        System.out.println(compare(a1, a2));
    }
}
