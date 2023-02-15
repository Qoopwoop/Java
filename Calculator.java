public class Calculator
{
double add(double a, double b)
{
double c=a+b;
System.out.println("add value is "+c);
return c;
}
double sub(double a,double b)
{
double c=a-b;
System.out.println("sub value is "+c);
return c;
}
double mul(double a,double b)
{
double c=a*b;
System.out.println("mul value is "+c);
return c;
}
double divQ(double a,double b)
{
double c=a/b;
System.out.println("divQ value is "+c);
return c;
}
double divR(double a,double b)
{
double c=a%b;
System.out.println("divR value is "+c);
return c;
}
public static void main(String args[])
{
Calculator cal= new Calculator();
cal.add(5.0,6.0);
cal.sub(7.0,3.0);
cal.mul(4.0,9.0);
cal.divQ(4.0,2.0);
cal.divR(17.0,3.0);
}
}
