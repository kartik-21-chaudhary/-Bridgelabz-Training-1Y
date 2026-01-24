import java.util.Scanner;
class HandShakes {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		double a = sc.nextDouble();
		double HandShakes = a*(a-1)/2;
		System.out.println("No of HandShakes:"+HandShakes);
		sc.close();
	}
}