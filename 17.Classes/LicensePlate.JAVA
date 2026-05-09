import java.util.*;

class LicensePlate {

    public static void main(String[] args) {

        String input = "AB1234";

        boolean valid = input.matches("^[A-Z]{2}[0-9]{4}$");

        System.out.println(valid);
    }
}