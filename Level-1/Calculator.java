import java.util.Scanner;
class Calculator {
   public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println(" enter the number 1");
       float num1 = scn.nextFloat();
       scn.nextLine();
       System.out.println(" enter the num 2");
       float num2 = scn.nextFloat();
       scn.nextLine();
       float sum = num1 + num2;
       float product = num1*num2;
       float divide = num1/num2;
       float subtract = num1 - num2;
       System.out.println("The addition, subtraction, multiplication and division value of 2 numbers  " + num1 + " and "+ num2 +" is " + sum + " "+ subtract + " " + " ," + product +" and " + divide);
    }

}