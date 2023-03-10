public class Mainstate
{
public static void main(String args[])
{
A a = new A();
a.display();
A b=new A();
b.scan();
A c=new A();
c.print();
}
}
class A
{
void display()
{
System.out.println("this is India");
}
}
class B extends A
{
void scan()
{
System.out.println("this is us");
}
}
class C extends B
{
void print()
{
System.out.println("this is pakistan");
}
}