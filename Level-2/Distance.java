import java.util.Scanner;

public class Distance {
    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" enter the distance in feet");
        double distanceInFeet = scn.nextDouble();
        double yard = (3.000*distanceInFeet);
        double mile = (1760.000*yard);
        System.out.println("the distance in yards is " + yard + " while the distance in miles is" + mile);
    }
}