import java.util.Scanner;
class SpringSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month in Digits");
		int a = sc.nextInt();
		System.out.println("Enter Date");
		int b = sc.nextInt();
		if(( a == 3 && b>=20) || (a == 4) || (a == 5) ||
		(a == 6 && b <=20)) {
			System.out.println("Its a spring season");
		}
		else{
			System.out.println("Not a spring Season");
		}
	}
}