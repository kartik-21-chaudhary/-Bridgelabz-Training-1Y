class CreditCard {

    public static void main(String[] args) {

        String card = "4123456789012345";

        boolean valid = card.matches("^(4\\d{15}|5\\d{15})$");

        System.out.println(valid);
    }
}