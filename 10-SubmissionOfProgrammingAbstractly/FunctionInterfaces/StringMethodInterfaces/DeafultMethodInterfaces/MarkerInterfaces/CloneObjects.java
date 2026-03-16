package FunctionInterfaces.StringMethodInterfaces.DeafultMethodInterfaces.MarkerInterfaces;
class Model implements Cloneable{
int x=10;
public Object clone() throws CloneNotSupportedException{
return super.clone();
}
}
class CloneObjects{
public static void main(String args) throws Exception{
Model m1=new Model();
Model m2=(Model)m1.clone();
System.out.println(m2.x);
}
}
