class Contact{
String name;
String phoneNumber;
Contact(String n,String p){
name=n;
phoneNumber=p;
}
void display(){
System.out.println(name+" "+phoneNumber);
}
}
class BusinessContact extends Contact{
String companyName;
BusinessContact(String n,String p,String c){
super(n,p);
companyName=c;
}
void display(){
System.out.println(name.toUpperCase()+" "+phoneNumber+" "+companyName);
}
}
class Main{
public static void main(String args[]){
Contact c=new BusinessContact("Rahul","999999","Google");
c.display();
}
}