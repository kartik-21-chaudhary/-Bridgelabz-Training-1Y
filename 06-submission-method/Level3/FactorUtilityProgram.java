package Level3;

import java.util.Scanner;

class FactorUtilityProgram {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                f[idx++] = i;
            }
        }
        return f;
    }

    public static int greatestFactor(int[] f) {
        int max = f[0];
        for (int i : f) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int sumFactors(int[] f) {
        int s = 0;
        for (int i : f) {
            s += i;
        
        }return s;
    }

    public static int productFactors(int[] f) {
        int p = 1;
        for (int i : f) {
            p *= i;
        
        }return p;
    }

    public static double cubeProduct(int[] f) {
        double p = 1;
        for (int i : f) {
            p *= Math.pow(i, 3);
        
        }return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = findFactors(n);
        System.out.println(greatestFactor(f));
        System.out.println(sumFactors(f));
        System.out.println(productFactors(f));
        System.out.println(cubeProduct(f));
    }
}
