abstract class Vehicle1{
private int vehicleId;
private String driverName;
private double ratePerKm;
public Vehicle1(int i,String d,double r){
vehicleId=i;
driverName=d;
ratePerKm=r;
}
public double getRate(){
return ratePerKm;
}
public abstract double calculateFare(double distance);
public void getVehicleDetails(){
System.out.println(vehicleId+" "+driverName);
}
}
interface GPS{
void getCurrentLocation();
void updateLocation();
}
class Car extends Vehicle1 implements GPS{
public Car(int i,String d,double r){
super(i,d,r);
}
public double calculateFare(double distance){
return distance*getRate();
}
public void getCurrentLocation(){
System.out.println("Location A");
}
public void updateLocation(){
System.out.println("Location Updated");
}
}
class Bike extends Vehicle1{
public Bike(int i,String d,double r){
super(i,d,r);
}
public double calculateFare(double distance){
return distance*getRate();
}
}
class Main{
public static void main(String args[]){
Vehicle1 v1=new Car(1,"Rahul",15);
Vehicle1 v2=new Bike(2,"Aman",10);
System.out.println(v1.calculateFare(10));
System.out.println(v2.calculateFare(10));
}
}