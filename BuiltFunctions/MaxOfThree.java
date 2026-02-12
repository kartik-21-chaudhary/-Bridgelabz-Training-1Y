import java.util.Scanner;
class MaxOfThree {
    static int getNumber(Scanner sc) {
        return sc.nextInt();
    }
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = getNumber(sc);
        System.out.print("Enter second number: ");
        int b = getNumber(sc);
        System.out.print("Enter third number: ");
        int c = getNumber(sc);
        int result = findMax(a, b, c);
        System.out.println("Maximum number is: " + result);
    }
}
