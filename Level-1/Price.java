import java.util.Scanner;
class Price{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double unitprice=sc.nextDouble();
		double quantity=sc.nextDouble();
		double totalprice=unitprice*quantity;
		System.out.println("The total purchase price is INR " + totalprice + " if the quantity " + quantity + " and unit price is INR " + unitprice);
	}
}