import java.util.Scanner;
class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the planet in km: ");
        double radiusKm = sc.nextDouble();
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);       
        double volumeMiles3 = volumeKm3 * 0.239913;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}
	
	