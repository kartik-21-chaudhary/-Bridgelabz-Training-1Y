import java.util.Scanner;
class Convert{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double kms=sc.nextDouble();
		double mile=kms*1.6;
		System.out.println("The total miles is " + mile + " for the given " + kms + " km");
	}
}