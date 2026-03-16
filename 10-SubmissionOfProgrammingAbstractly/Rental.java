interface Rental{
void rent();
void returnVehicle();
}
class Car implements Rental{
public void rent(){
System.out.println("Car Rented");
}
public void returnVehicle(){
System.out.println("Car Returned");
}
}
class Bike implements Rental{
public void rent(){
System.out.println("Bike Rented");
}
public void returnVehicle(){
System.out.println("Bike Returned");
}
}
class Bus implements Rental{
public void rent(){
System.out.println("Bus Rented");
}
public void returnVehicle(){
System.out.println("Bus Returned");
}
}
class Main{
public static void main(String args[]){
Rental r=new Car();
r.rent();
r.returnVehicle();
}
}