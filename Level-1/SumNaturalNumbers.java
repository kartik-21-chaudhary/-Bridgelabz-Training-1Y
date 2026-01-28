import java.util.Scanner;
class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop = sumLoop + i;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);
            if (sumFormula == sumLoop) {
                System.out.println("Both results are equal");
            }
        } else {
            System.out.println("Please enter a Natural Number");
        }
    }
}
