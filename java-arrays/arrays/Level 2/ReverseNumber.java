import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int i = 0;
        while (num != 0) {
            digits[i++] = num % 10;
            num /= 10;
        }
        for (int j = 0; j < count; j++)
            System.out.print(digits[j]);
    }
}
