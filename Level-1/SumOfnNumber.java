import java.util.Scanner;
class SumOfnNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number: ");
		int a = sc.nextInt();
		int Sum = a * (a+1)/2;
		if(a>0){
				System.out.println("The sum of "+a+" natural numbers is "+Sum);
		}
		else{
					System.out.println("The number " + a + " is not a natural number");
		}	sc.close();
		}
	}
