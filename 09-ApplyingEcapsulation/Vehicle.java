abstract class Vehicle{
private String vehicleNumber;
private String type;
private double rentalRate;
public Vehicle(String v,String t,double r){
vehicleNumber=v;
type=t;
rentalRate=r;
}
public double getRentalRate(){
return rentalRate;
}
public abstract double calculateRentalCost(int days);
}
interface Insurable{
double calculateInsurance();
String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
public Car(String v,double r){
super(v,"Car",r);
}
public double calculateRentalCost(int d){
return getRentalRate()*d;
}
public double calculateInsurance(){
return 500;
}
public String getInsuranceDetails(){
return "Car Insurance";
}
}
class Bike extends Vehicle{
public Bike(String v,double r){
super(v,"Bike",r);
}
public double calculateRentalCost(int d){
return getRentalRate()*d;
}
}
class Main{
public static void main(String args[]){
Vehicle v1=new Car("UP12",1000);
Vehicle v2=new Bike("UP34",300);
System.out.println(v1.calculateRentalCost(3));
System.out.println(v2.calculateRentalCost(3));
}
}