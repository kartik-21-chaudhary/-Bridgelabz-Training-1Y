import java.util.Scanner;
class NumberFormatZero {
    static void generate(String text) {
        int n = Integer.parseInt(text);
        System.out.println(n);
    }

    static void handle(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generate(text);
        } catch (Exception e) {
            handle(text);
        }
    }
}
