
import java.util.Scanner;

class SmallLargeProgram {

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int small = Math.min(n1, Math.min(n2, n3));
        int large = Math.max(n1, Math.max(n2, n3));
        return new int[]{small, large};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
