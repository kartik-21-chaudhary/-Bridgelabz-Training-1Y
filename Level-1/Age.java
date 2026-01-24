import java.util.Scanner;
class Age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int birthyear=sc.nextInt();
		int currentyear=2024;
		int age=currentyear-birthyear;
		System.out.println("Harry's age in 2024 is "+age);
	}
}