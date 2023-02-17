public class DynaBid
{
public static void main(String args[])
{
A2B a2b = new A2BUs();
a2b.tax(100.0);
 a2b = new A2BUk();
a2b.tax(100.0);
 a2b = new A2BIn();
a2b.tax(100.0);
}
}
class A2B
{
double tax(double billAmount)
{
double taxpercentage=10.0;
double taxAmount=billAmount*taxpercentage/100.00;
System.out.println(taxAmount);
return taxAmount;
}
}
class A2BUs extends A2B
{
double tax(double billAmount)
{
double taxpercentage=20.0;
double taxAmount=billAmount*taxpercentage/100.00;
System.out.println(taxAmount);
return taxAmount;
}
}
class A2BUk extends A2B
{
double tax(double billAmount)
{
double taxpercentage=30.0;
double taxAmount=billAmount*taxpercentage/100.00;
System.out.println(taxAmount);
return taxAmount;
}
}
class A2BIn extends A2B
{
double tax(double billAmount)
{
double taxpercentage=5.0;
double taxAmount=billAmount*taxpercentage/100.00;
System.out.println(taxAmount);
return taxAmount;
}
}
