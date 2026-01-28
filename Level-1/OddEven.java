import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
            System.out.println("Enter the Natural Number");
        int a = sc.nextInt();

        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even " + i);
                } else {
                    System.out.println("Odd " + i);
                }
            }
        } 

        sc.close();
    }
}
