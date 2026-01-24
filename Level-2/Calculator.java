import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println(" enter the number1");
       double num1 = scn.nextInt();
       scn.nextLine();
       System.out.println(" enter the num2");
       double num2 = scn.nextInt();
       scn.nextLine();
       double sum = num1 + num2;
       double product = num1*num2;
       double divide = num1/num2;
       double subtract = num1 - num2;
       System.out.println(" the sum,product,multiplication and substraction of the "+ num1 + "and"+ num2 +"is "+ sum +" "+ product+ " " + " ," + divide +"and " +subtract);
    }

}