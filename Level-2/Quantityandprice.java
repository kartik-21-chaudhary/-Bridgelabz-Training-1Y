import java.util.Scanner;

public class Quantityandprice {
    static void main(String[] args) {
        Scanner SCN = new Scanner(System.in);
        System.out.println(" enter the unit price");
            double unitprice = SCN.nextDouble();
            SCN.nextLine();
            System.out.println("enter the quantity");
            int quantity = SCN.nextInt();
            double pricetotal = unitprice*quantity;
        System.out.println("The total purchase price is INR" + pricetotal+" the quantity" +quantity+ " and unit price is INR  " + unitprice);
    }
}