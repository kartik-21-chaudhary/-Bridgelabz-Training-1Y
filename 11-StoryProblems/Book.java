class Book{
int bookId;
String title;
double price;
static String libraryName="CityLibrary";
Book(int i,String t,double p){
bookId=i;
title=t;
price=p;
}
double calculateFine(int daysLate){
return 0;
}
}
class TextBook extends Book{
TextBook(int i,String t,double p){
super(i,t,p);
}
double calculateFine(int daysLate){
return daysLate*2;
}
}
class Magazine extends Book{
Magazine(int i,String t,double p){
super(i,t,p);
}
double calculateFine(int daysLate){
return daysLate*5;
}
}
class Main{
public static void main(String args[]){
Book b1=new TextBook(1,"Math",200);
Book b2=new Magazine(2,"Tech",100);
System.out.println(b1.calculateFine(3));
System.out.println(b2.calculateFine(3));
}
}