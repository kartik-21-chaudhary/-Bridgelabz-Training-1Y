abstract class FoodItem{
private String itemName;
private double price;
private int quantity;
public FoodItem(String n,double p,int q){
itemName=n;
price=p;
quantity=q;
}
public double getPrice(){
return price;
}
public int getQuantity(){
return quantity;
}
public abstract double calculateTotalPrice();
public void getItemDetails(){
System.out.println(itemName+" "+price+" "+quantity);
}
}
interface Discountable{
double applyDiscount();
String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
public VegItem(String n,double p,int q){
super(n,p,q);
}
public double calculateTotalPrice(){
return getPrice()*getQuantity();
}
public double applyDiscount(){
return 10;
}
public String getDiscountDetails(){
return "Veg Discount";
}
}
class NonVegItem extends FoodItem{
public NonVegItem(String n,double p,int q){
super(n,p,q);
}
public double calculateTotalPrice(){
return (getPrice()*getQuantity())+50;
}
}
class Main{
public static void main(String args[]){
FoodItem f1=new VegItem("Paneer",200,2);
FoodItem f2=new NonVegItem("Chicken",300,2);
System.out.println(f1.calculateTotalPrice());
System.out.println(f2.calculateTotalPrice());
}
}