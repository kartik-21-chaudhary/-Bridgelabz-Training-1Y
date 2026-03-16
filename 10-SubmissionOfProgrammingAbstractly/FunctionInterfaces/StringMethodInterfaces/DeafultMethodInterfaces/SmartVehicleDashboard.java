package FunctionInterfaces.StringMethodInterfaces.DeafultMethodInterfaces;
interface Dashboard{
void displaySpeed();
default void displayBattery(){
System.out.println("Battery 80%");
}
}
class ElectricCar implements Dashboard{
public void displaySpeed(){
System.out.println("Speed 60");
}
}
class SmartVehicleDashboard{
public static void main(String args[]){
Dashboard d=new ElectricCar();
d.displaySpeed();
d.displayBattery();
}
}