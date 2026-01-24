import java.util.Scanner;
class AverageOfMarks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maths Number");
		int Maths = sc.nextInt();
		System.out.println("Enter Physics Number");
		int Physics = sc.nextInt();
		System.out.println("Enter Chemistry Number");
		int Chemistry = sc.nextInt();
		float Avg = (Maths+Physics+Chemistry)/3;
		System.out.println("Sams average mark in PCM is "+Avg);
		sc.close();
	}
}