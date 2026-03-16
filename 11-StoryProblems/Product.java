class Product{
int productId;
String productName;
Product(int i,String n){
productId=i;
productName=n;
}
boolean isMatch(String keyword){
return productName.contains(keyword);
}
}
class ElectronicProduct extends Product{
String brand;
ElectronicProduct(int i,String n,String b){
super(i,n);
brand=b;
}
boolean isMatch(String keyword){
return productName.contains(keyword)||brand.contains(keyword);
}
}
class Main{
public static void main(String args[]){
Product p=new ElectronicProduct(1,"Laptop","Dell");
System.out.println(p.isMatch("Dell"));
}
}