import java.util.Scanner;

public class Perimeter {
    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" enter the perimeter of the tringle");
        double perimeter = scn.nextDouble();
        double side = (perimeter/4);
        System.out.println("the length of the side" + side + " whose perimeter is " +perimeter);

    }
}