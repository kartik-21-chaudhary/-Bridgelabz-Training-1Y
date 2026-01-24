import java.util.Scanner;
class Height{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		float cms=sc.nextFloat();
		float inches=cms/2.54f;
		float foot=inches/12;
		System.out.println("Your Height in cm is " + cms + " while in feet is " + foot + " and inches is " + inches);
	}
}

		