abstract class Product{
private int productId;
private String name;
private double price;
public Product(int id,String n,double p){
productId=id;
name=n;
price=p;
}
public double getPrice(){
return price;
}
public abstract double calculateDiscount();
}
interface Taxable{
double calculateTax();
String getTaxDetails();
}
class Electronics extends Product implements Taxable{
public Electronics(int id,String n,double p){
super(id,n,p);
}
public double calculateDiscount(){
return getPrice()*0.1;
}
public double calculateTax(){
return getPrice()*0.18;
}
public String getTaxDetails(){
return "Electronics Tax";
}
}
class Clothing extends Product{
public Clothing(int id,String n,double p){
super(id,n,p);
}
public double calculateDiscount(){
return getPrice()*0.2;
}
}
class Groceries extends Product{
public Groceries(int id,String n,double p){
super(id,n,p);
}
public double calculateDiscount(){
return getPrice()*0.05;
}
}
class Main{
public static void main(String args[]){
Product p1=new Electronics(1,"Laptop",50000);
Product p2=new Clothing(2,"Shirt",1000);
System.out.println(p1.getPrice()-p1.calculateDiscount());
System.out.println(p2.getPrice()-p2.calculateDiscount());
}
}