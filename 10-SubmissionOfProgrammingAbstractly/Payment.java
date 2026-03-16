interface Payment{
void pay(double amount);
}
class UPI implements Payment{
public void pay(double amount){
System.out.println("UPI Payment "+amount);
}
}
class CreditCard implements Payment{
public void pay(double amount){
System.out.println("Card Payment "+amount);
}
}
class Wallet implements Payment{
public void pay(double amount){
System.out.println("Wallet Payment "+amount);
}
}
class Main{
public static void main(String args[]){
Payment p=new UPI();
p.pay(500);
}
}