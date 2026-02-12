import java.util.Scanner;
class FactorialRec {
    static long fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        long result = fact(num);
        System.out.println("Factorial is: " + result);
    }
}
