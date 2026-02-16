package Level3;

import java.util.Scanner;

class NumberUtilityThree {

    public static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static int[] storeDigits(int n) {
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            d[i] = n % 10;
            n /= 10;
        }
        return d;
    }

    public static int[] reverseArray(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            r[i] = d[d.length - 1 - i];
        }
        return r;
    }

    public static boolean compare(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] d) {
        return compare(d, reverseArray(d));
    }

    public static boolean isDuck(int[] d) {
        for (int i : d) {
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = storeDigits(n);
        System.out.println(isPalindrome(d));
        System.out.println(isDuck(d));
    }
}
