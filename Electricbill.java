public class Electricbill
{
public static void main(String args[])
{
Electricbill eb=new Electricbill();
eb.billAmount(413);
}
double billAmount(double usageunit)
{
if(usageunit<=95)
{
System.out.println("charges free");
}
else 
if(usageunit<=200)
{
System.out.println(usageunit*2.25);
}
else
if(usageunit<=400)
{
System.out.println(usageunit*4.50);
}
else
if(usageunit<=500)
{
System.out.println(usageunit*6.00);
}
else
{
System.out.println("above 500 usage of customer");
}
return usageunit;
}
}