import java.util.Scanner;
class PrimeCheck {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isPrime(num))
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }
}
