package Level3;

import java.util.Scanner;

class NumberProgram {

    public static int sumProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumProperDivisors(n) < n;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        
        }return f;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
        System.out.println(isAbundant(n));
        System.out.println(isDeficient(n));
        System.out.println(isStrong(n));
    }
}
