class Course{
int courseId;
String courseName;
double price;
static String platformName="LearnHub";
Course(int i,String n,double p){
courseId=i;
courseName=n;
price=p;
}
double getFinalPrice(){
return price;
}
String formatName(){
return courseName.substring(0,1).toUpperCase()+courseName.substring(1).toLowerCase();
}
}
class RecordedCourse extends Course{
RecordedCourse(int i,String n,double p){
super(i,n,p);
}
double getFinalPrice(){
return price*0.9;
}
}
class LiveCourse extends Course{
LiveCourse(int i,String n,double p){
super(i,n,p);
}
double getFinalPrice(){
return price*0.95;
}
}
class Main{
public static void main(String args[]){
Course c1=new RecordedCourse(1,"java",1000);
Course c2=new LiveCourse(2,"python",1000);
System.out.println(c1.formatName()+" "+c1.getFinalPrice());
System.out.println(c2.formatName()+" "+c2.getFinalPrice());
}
}