import java.util.Scanner;
class MethodOverloading
{
int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b)
{
return a+b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
MethodOverloading obj=new MethodOverloading();
System.out.print("Enter first number:");
int n1=sc.nextInt();
System.out.print("Enter second number:");
int n2=sc.nextInt();
System.out.print("Sum of two numbers="+obj.add(n1,n2));
System.out.print("Enter third number:");
int n3=sc.nextInt();
System.out.print("Sum of three numbers="+obj.add(n1,n2,n3));
System.out.print("\nEnter first decimal number:");
double d1=sc.nextDouble();
System.out.print("\nEnter second decimal number:");
double d2=sc.nextDouble();
System.out.println("Sum of two decimal numbers="+obj.add(d1,d2));
sc.close();
}
}
