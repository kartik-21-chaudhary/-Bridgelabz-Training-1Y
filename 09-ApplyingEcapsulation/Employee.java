abstract class Employee{
private int employeeId;
private String name;
private double baseSalary;
public Employee(int id,String n,double s){
employeeId=id;
name=n;
baseSalary=s;
}
public int getEmployeeId(){
return employeeId;
}
public String getName(){
return name;
}
public double getBaseSalary(){
return baseSalary;
}
public abstract double calculateSalary();
public void displayDetails(){
System.out.println(employeeId+" "+name+" "+calculateSalary());
}
}
interface Department{
void assignDepartment(String d);
String getDepartmentDetails();
}
class FullTimeEmployee extends Employee implements Department{
private String dept;
public FullTimeEmployee(int id,String n,double s){
super(id,n,s);
}
public double calculateSalary(){
return getBaseSalary();
}
public void assignDepartment(String d){
dept=d;
}
public String getDepartmentDetails(){
return dept;
}
}
class PartTimeEmployee extends Employee implements Department{
private int hours;
private String dept;
public PartTimeEmployee(int id,String n,double s,int h){
super(id,n,s);
hours=h;
}
public double calculateSalary(){
return getBaseSalary()*hours;
}
public void assignDepartment(String d){
dept=d;
}
public String getDepartmentDetails(){
return dept;
}
}
class Main{
public static void main(String args[]){
Employee e1=new FullTimeEmployee(1,"Rahul",50000);
Employee e2=new PartTimeEmployee(2,"Aman",200,5);
e1.displayDetails();
e2.displayDetails();
}
}