package FunctionInterfaces;
import java.util.function.Function;
class StringLengthChecker{
public static void main(String args[]){
Function<String,Integer> f=s->s.length();
System.out.println(f.apply("HelloWorld"));
}
}
