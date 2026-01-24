import java.util.Scanner;
public class Areaoftriangle {
    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" enter the base of tringle");
            double base = scn.nextDouble();
            scn.nextDouble();
            System.out.println(" enter the height of the tringle");
        double height = scn.nextDouble();
        double Area = (0.50)*(base)*(height);
        System.out.println(Area);
    }
}