import java.util.Scanner;
class Divide{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int Pen=sc.nextInt();
		int Students=sc.nextInt();
		double DistributedPens=Pen/Students;
		double left=Pen%Students;
		System.out.println("The Pen Per Student is " + DistributedPens +  "and the remaining pen not distributed is " + left);
	}
}