package Level2;

import java.util.Scanner;

class UnitConvert {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        System.out.println(convertYardsToFeet(v));
        System.out.println(convertFeetToYards(v));
        System.out.println(convertMetersToInches(v));
        System.out.println(convertInchesToMeters(v));
        System.out.println(convertInchesToCm(v));
    }
}
