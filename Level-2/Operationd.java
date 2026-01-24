import java.util.Scanner;
class Operationd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double result=(a+b)*c;
		double result1=a*(b+c);
		double result2=(c+a)/b;
		double result3=(a%b)+c;
		System.out.println("The results of Int Operations are " + result + "," + result1 + "," + result2 + " and " + result3);
	}
}
		