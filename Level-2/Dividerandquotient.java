import java.util.Scanner;

public class Dividerandquoietient {
    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" enter the number 1 ");
            double number1 = scn.nextDouble();
            scn.nextLine();
        System.out.println(" enter the number 2");
            double number2 = scn.nextDouble();
                double que = (number1)/(number2);
                double   rem = number1%number2;
        System.out.println("The Quotient is "+que + "  and Reminder is" + rem+ "  of two number" + number1 + " and  " + number2);

    }
}