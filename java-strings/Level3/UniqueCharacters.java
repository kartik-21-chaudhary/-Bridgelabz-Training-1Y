package Level3;
import java.util.Scanner;

class UniqueCharacters {

    static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    static char[] findUnique(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count++] = ch;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] unique = findUnique(text);
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}

