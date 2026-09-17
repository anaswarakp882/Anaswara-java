public class Calculator{
public int add(int a,int b){
return a+b;
}
public int add(int a,int b,int c){
return a+b+c;
}
public double add(double a,double b){
return a+b;
}
public void display(String name,int id){
System.out.println("Name:"+name+",ID:"+id);
}
public void display(int id,String name){
System.out.println("ID:"+id+",Name:"+name);
}
public static void main(String[]args){
Calculator calc=new Calculator();
System.out.println("Sum(2 ints):"+calc.add(5,10));
System.out.println("Sum(3 ints):"+calc.add(5,10,15));
System.out.println("Sum(2 doubles):"+calc.add(2.5,3.5));
calc.display("Alice",101);
calc.display(102,"Bob");
}
}

