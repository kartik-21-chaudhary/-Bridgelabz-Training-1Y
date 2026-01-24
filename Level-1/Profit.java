import java.util.Scanner;

class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        float CP = sc.nextFloat();    
        System.out.print("Enter Selling Price: ");
        float SP = sc.nextFloat();       
        float profit = SP - CP;
        float profitpercentage = (profit / CP) * 100;
        System.out.println("The Cost Price is INR " + CP + " and Selling Price is INR " + SP +
        "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitpercentage + "%");
    } 
} 