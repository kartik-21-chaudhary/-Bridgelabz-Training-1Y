
class UsernameValidation {

    public static void main(String[] args) {

        String input = "user_123";

        boolean valid = input.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");

        System.out.println(valid ? "Valid" : "Invalid");
    }
}