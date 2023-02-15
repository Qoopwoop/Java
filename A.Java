public class A
{
int add1(int a, int b)
{
int c=a+b;
System.out.println(c);
return c;
}
int add2(int a,int b,int c)
{
int d=a+b+c;
System.out.println(d);
return d;
}
public static void main(String args[])
{
A a=new A();
a.add1(7,3);
a.add2(2,3,1);
}
}


