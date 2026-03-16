package FunctionInterfaces.StringMethodInterfaces.DeafultMethodInterfaces.MarkerInterfaces;
interface Backup{}
class Data implements Backup{
String name="File";
}
class DataBackup{
public static void main(String args[]){
Data d=new Data();
if(d instanceof Backup){
System.out.println("Backup Allowed");
}
}
}
