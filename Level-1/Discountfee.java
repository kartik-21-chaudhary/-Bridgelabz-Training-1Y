import java.util.Scanner;
class Discountfee{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int fee = sc.nextInt();
		float discountpercent = sc.nextFloat();
		double discount=(fee*discountpercent)/100;
		double feetopay=fee-discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + feetopay);
	}
}
		
		