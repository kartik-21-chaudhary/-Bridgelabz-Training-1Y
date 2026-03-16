class Employee{
int empId;
String name;
Employee(int i,String n){
empId=i;
name=n;
}
String generateEmail(){
return name.toLowerCase()+"@company.com";
}
}
class Manager extends Employee{
String department;
Manager(int i,String n,String d){
super(i,n);
department=d;
}
String generateEmail(){
return name.toLowerCase()+"."+department.toLowerCase()+"@company.com";
}
}
class Main{
public static void main(String args[]){
Employee e=new Manager(1,"Rahul","Sales");
System.out.println(e.generateEmail());
}
}