import java.util.Scanner;
class Distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double DistanceInFeet = sc.nextDouble();
		//float inches=DistanceInFeet/12;
        double Yards=DistanceInFeet/3;        
        double miles=Yards/1760;
        System.out.println("Your Height in miles is " + miles + " while in feet is " + DistanceInFeet + " and inches is " );
		sc.close();
    }
}