package Level3;

import java.util.Scanner;

class NumberUtility {

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

    public static int sumDigits(int[] d) {
        int s = 0;
        for (int i : d) {
            s += i;
        
        }return s;
    }

    public static double sumSquareDigits(int[] d) {
        double s = 0;
        for (int i : d) {
            s += Math.pow(i, 2);
        
        }return s;
    }

    public static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    public static int[][] digitFrequency(int[] d) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int i : d) {
            freq[i][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = storeDigits(n);
        System.out.println(sumDigits(d));
        System.out.println(sumSquareDigits(d));
        System.out.println(isHarshad(n, d));
        int[][] f = digitFrequency(d);
        for (int i = 0; i < 10; i++) {
            System.out.println(f[i][0] + " " + f[i][1]);
        }
    }
}
