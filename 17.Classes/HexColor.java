
class HexColor {

    public static void main(String[] args) {

        String input = "#FFA500";

        boolean valid = input.matches("^#[0-9A-Fa-f]{6}$");

        System.out.println(valid);
    }
}