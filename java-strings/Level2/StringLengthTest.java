package Level2;
import java.util.Scanner;
class StringLengthTest {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        System.out.println(findLength(text));
        System.out.println(text.length());
    }
}

