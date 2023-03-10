public class Electricbilling
{
public static void main(String args[])
{
Electricbilling eb=new Electricbilling();
eb.Billupto500(413);
//change
}
double Billupto500(double usage)
{
int n = 1;
switch(n)
{
case 1:
//1<=100
System.out.println("Charges free");
case 2:
//101<=200
System.out.println(usage*2.5);
case 3:
//200<=400
System.out.println(usage*5.5);
case 4:
//400<=1000
System.out.println(usage*7.5);
break;
default:
System.out.println("IN");
}
return usage;
}
}