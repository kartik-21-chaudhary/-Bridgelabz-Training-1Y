package FunctionInterfaces.StringMethodInterfaces;
import java.time.LocalDate;
interface DateUtil{
static String formatDate(){
return LocalDate.now().toString();
}
}
class DateFormat{
public static void main(String args[]){
System.out.println(DateUtil.formatDate());
}
}