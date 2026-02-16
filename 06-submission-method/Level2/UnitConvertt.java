package Level2;

import java.util.Scanner;

class UnitConvertt {

    public static double convertFToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double p) {
        return p * 0.453592;
    }

    public static double convertKgToPounds(double k) {
        return k * 2.20462;
    }

    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(convertFToC(v));
        System.out.println(convertCToF(v));
        System.out.println(convertPoundsToKg(v));
        System.out.println(convertKgToPounds(v));
        System.out.println(convertGallonsToLiters(v));
        System.out.println(convertLitersToGallons(v));
    }
}
