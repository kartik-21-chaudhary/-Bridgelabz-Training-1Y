import java.util.Scanner;
class SmallestOf3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter Third Number: ");
		int c = sc.nextInt();
		if( a<b && a<c){
			System.out.println("Is the first number the smallest? Yes");
		}
		else{
			System.out.println("Is the first number the smallest? No");
		}
		sc.close();
	}
}