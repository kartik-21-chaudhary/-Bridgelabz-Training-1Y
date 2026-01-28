import java.util.Scanner;
class Bonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year of Service");
		int a = sc.nextInt();
		System.out.println("Enter Previous Salary");
		int S = sc.nextInt();
		int B = (S * 5)/100;
		int UpdatedSalary = S + B;
		if(a > 5){
			System.out.println("The Salary is: "+UpdatedSalary);
		}
		else{
			System.out.println("Remain Same");
		}
		sc.close();
	}
}