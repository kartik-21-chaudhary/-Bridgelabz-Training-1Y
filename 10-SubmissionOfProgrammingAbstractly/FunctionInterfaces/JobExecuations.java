package FunctionInterfaces;
class JobExecuations{
public static void main(String args[]){
Runnable r=()->System.out.println("Job Running");
Thread t=new Thread(r);
t.start();
}
}
