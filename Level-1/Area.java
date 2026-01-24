import java.util.Scanner;
class Area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double base= sc.nextDouble();
		double height=sc.nextDouble();
		double Area=(base*height)/2;
		double inches=Area/2.54;
		double foot=inches/12;
		System.out.println(" Your Height in cm is " + height + " while in feet is " + foot + " and inches is " + inches);
	}
}