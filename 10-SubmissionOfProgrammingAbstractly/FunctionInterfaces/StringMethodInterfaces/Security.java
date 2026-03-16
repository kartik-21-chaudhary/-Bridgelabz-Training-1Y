package FunctionInterfaces.StringMethodInterfaces;
interface SecurityUtils{
static boolean checkPassword(String p){
return p.length()>=8;
}
}
class Security{
public static void main(String args[]){
System.out.println(SecurityUtils.checkPassword("password123"));
}
}