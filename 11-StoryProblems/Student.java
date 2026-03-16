class Student{
int rollNo;
String name;
int marks;
Student(int r,String n,int m){
rollNo=r;
name=n;
marks=m;
}
String calculateGrade(){
if(marks>=80)return "A";
else if(marks>=60)return "B";
else return "C";
}
}
class EngineeringStudent extends Student{
String branch;
EngineeringStudent(int r,String n,int m,String b){
super(r,n,m);
branch=b;
}
String calculateGrade(){
return name+" "+branch+" "+super.calculateGrade();
}
}
class Main{
public static void main(String args[]){
Student s=new EngineeringStudent(1,"Aman",85,"CSE");
System.out.println(s.calculateGrade());
}
}