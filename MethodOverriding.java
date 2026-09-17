class Department{
void run(){
System.out.println("Listing Department");
}
}
class BCA extends Department{
void run(){
System.out.println("BCA");
}
}
public class MethodOverriding{
public static void main(String[]args){
Department d=new Department();
d.run();
BCA b=new BCA();
b.run();
Department obj=new BCA();
obj.run();
}
}