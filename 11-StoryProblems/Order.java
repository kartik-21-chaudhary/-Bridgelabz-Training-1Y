class Order{
int orderId;
double baseAmount;
static double deliveryCharge=40;
Order(int i,double b){
orderId=i;
baseAmount=b;
}
double calculateBill(){
return baseAmount+deliveryCharge;
}
}
class RegularOrder extends Order{
RegularOrder(int i,double b){
super(i,b);
}
double calculateBill(){
return baseAmount+deliveryCharge;
}
}
class PremiumOrder extends Order{
PremiumOrder(int i,double b){
super(i,b);
}
double calculateBill(){
return (baseAmount*0.8)+deliveryCharge;
}
}
class Main{
public static void main(String args[]){
Order o1=new RegularOrder(1,500);
Order o2=new PremiumOrder(2,500);
System.out.println(o1.calculateBill());
System.out.println(o2.calculateBill());
}
}