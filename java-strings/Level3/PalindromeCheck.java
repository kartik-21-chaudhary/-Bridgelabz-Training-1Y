package Level3;
import java.util.Scanner;

class PalindromeCheck {

    static boolean isPalindromeLogic1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end)
            return true;
        if (s.charAt(start) != s.charAt(end))
            return false;
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    static char[] reverseString(String s) {
        char[] rev = new char[s.length()];
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            rev[index++] = s.charAt(i);
        }
        return rev;
    }

    static boolean isPalindromeLogic3(String s) {
        char[] original = s.toCharArray();
        char[] reverse = reverseString(s);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Logic 1 Result: " + isPalindromeLogic1(text));
        System.out.println("Logic 2 Result: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 Result: " + isPalindromeLogic3(text));
    }
}

