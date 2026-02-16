package Level3;

import java.util.Scanner;

class NumberUtilityProgram {

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length, sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == n;
    }

    public static int[] largestTwo(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        return new int[]{max, second};
    }

    public static int[] smallestTwo(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        return new int[]{min, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = storeDigits(n);
        System.out.println(isDuck(digits));
        System.out.println(isArmstrong(n, digits));
        int[] l = largestTwo(digits);
        int[] s = smallestTwo(digits);
        System.out.println(l[0] + " " + l[1]);
        System.out.println(s[0] + " " + s[1]);
    }
}
