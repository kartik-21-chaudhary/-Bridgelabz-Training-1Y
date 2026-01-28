import java.util.Scanner;
class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        System.out.println("Enter power:");
        int power = sc.nextInt();
        if (number > 0 && power > 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result = result * number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);
        } else {
            System.out.println("Please enter positive integers only");
        }
    }
}
