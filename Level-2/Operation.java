import java.util.Scanner;
class Operation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result=(a+b)*c;
		int result1=a*(b+c);
		int result2=(c+a)/b;
		int result3=(a%b)+c;
		System.out.println("The results of Int Operations are " + result + "," + result1 + "," + result2 + " and " + result3);
	}
}
		