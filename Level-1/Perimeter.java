import java.util.Scanner;
class Perimeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double peri=sc.nextDouble();
		double Side=peri/4;
		System.out.println("The length of the side is " + Side + " whose perimeter is " + peri);
	}
}