package FunctionInterfaces;
import java.util.function.Predicate;
class Main{
public static void main(String args[]){
Predicate<Double> alert=t->t>40;
System.out.println(alert.test(45.0));
}
}
