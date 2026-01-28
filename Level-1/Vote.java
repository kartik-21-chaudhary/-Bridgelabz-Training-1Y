import java.util.Scanner;
class Vote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String a = sc.nextLine();
		System.out.println("Enter Age: ");
		int b = sc.nextInt();
		if(b>=18){
			System.out.println(a +" age is " + b + " and can vote");
		}
		else {
			System.out.println(a +" age is " + b + " and cannot vote");
		}
		sc.close();
	}
}