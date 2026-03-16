abstract class Patient{
private int patientId;
private String name;
private int age;
public Patient(int i,String n,int a){
patientId=i;
name=n;
age=a;
}
public abstract double calculateBill();
public void getPatientDetails(){
System.out.println(name+" "+age);
}
}
interface MedicalRecord{
void addRecord(String r);
void viewRecords();
}
class InPatient extends Patient implements MedicalRecord{
private String record;
public InPatient(int i,String n,int a){
super(i,n,a);
}
public double calculateBill(){
return 5000;
}
public void addRecord(String r){
record=r;
}
public void viewRecords(){
System.out.println(record);
}
}
class OutPatient extends Patient{
public OutPatient(int i,String n,int a){
super(i,n,a);
}
public double calculateBill(){
return 1000;
}
}
class Main{
public static void main(String args[]){
Patient p1=new InPatient(1,"Rahul",30);
Patient p2=new OutPatient(2,"Aman",25);
System.out.println(p1.calculateBill());
System.out.println(p2.calculateBill());
}
}