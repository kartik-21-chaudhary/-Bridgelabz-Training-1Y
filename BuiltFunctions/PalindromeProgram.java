import java.util.Scanner;
class PalindromeProgram {
    static String getInput(Scanner sc) {
        System.out.print("Enter string: ");
        return sc.nextLine();
    }
    static boolean checkPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = getInput(sc);
        if (checkPalindrome(text))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}
