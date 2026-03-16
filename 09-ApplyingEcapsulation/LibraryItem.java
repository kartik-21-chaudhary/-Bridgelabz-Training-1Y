abstract class LibraryItem{
private int itemId;
private String title;
private String author;
public LibraryItem(int i,String t,String a){
itemId=i;
title=t;
author=a;
}
public abstract int getLoanDuration();
public void getItemDetails(){
System.out.println(title+" "+author);
}
}
interface Reservable{
void reserveItem();
boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
public Book(int i,String t,String a){
super(i,t,a);
}
public int getLoanDuration(){
return 14;
}
public void reserveItem(){
System.out.println("Book Reserved");
}
public boolean checkAvailability(){
return true;
}
}
class Magazine extends LibraryItem{
public Magazine(int i,String t,String a){
super(i,t,a);
}
public int getLoanDuration(){
return 7;
}
}
class Main{
public static void main(String args[]){
LibraryItem b=new Book(1,"Java","James");
b.getItemDetails();
System.out.println(b.getLoanDuration());
}
}