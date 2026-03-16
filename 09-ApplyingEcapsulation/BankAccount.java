abstract class BankAccount{
private int accountNumber;
private String holderName;
private double balance;
public BankAccount(int a,String h,double b){
accountNumber=a;
holderName=h;
balance=b;
}
public void deposit(double amt){
balance+=amt;
}
public void withdraw(double amt){
balance-=amt;
}
public double getBalance(){
return balance;
}
public abstract double calculateInterest();
}
interface Loanable{
void applyForLoan();
double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable{
public SavingsAccount(int a,String h,double b){
super(a,h,b);
}
public double calculateInterest(){
return getBalance()*0.05;
}
public void applyForLoan(){
System.out.println("Loan Applied");
}
public double calculateLoanEligibility(){
return getBalance()*2;
}
}
class CurrentAccount extends BankAccount{
public CurrentAccount(int a,String h,double b){
super(a,h,b);
}
public double calculateInterest(){
return getBalance()*0.02;
}
}
class Main{
public static void main(String args[]){
BankAccount a1=new SavingsAccount(1,"Rahul",10000);
BankAccount a2=new CurrentAccount(2,"Aman",20000);
System.out.println(a1.calculateInterest());
System.out.println(a2.calculateInterest());
}
}