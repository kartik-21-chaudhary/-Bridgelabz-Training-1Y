import java.util.Scanner;
class Convertdstokm{
	Scanner sc=new Scanner(System.in);
	double kms=sc.nextDouble();
	public static void main(String[] args){
		double mile=kms*1.6;
		System.out.println("The total miles is " + mile + " for the given " + kms + " km");
	}
}