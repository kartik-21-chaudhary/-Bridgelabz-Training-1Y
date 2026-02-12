import java.util.Scanner;
class SimpleCalculator {
    static double add(double a, double b) {
        return a + b;
    }
    static double sub(double a, double b) {
        return a - b;
    }
    static double mul(double a, double b) {
        return a * b;
    }
    static double div(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("1.Add  2.Sub  3.Mul  4.Div");
        int choice = sc.nextInt();
        if (choice == 1)
            System.out.println("Answer: " + add(a, b));
        else if (choice == 2)
            System.out.println("Answer: " + sub(a, b));
        else if (choice == 3)
            System.out.println("Answer: " + mul(a, b));
        else if (choice == 4)
            System.out.println("Answer: " + div(a, b));
        else
            System.out.println("Invalid choice");
    }
}
