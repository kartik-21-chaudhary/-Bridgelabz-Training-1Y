
import java.util.Scanner;

class ChoclateProgram {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int each = number / divisor;
        int remaining = number % divisor;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
