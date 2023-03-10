public class PrimeNumbercount
{
public static void main(String args[])
{
int number=97;
int counter=0;
for(int i=2;i<=number/2;i=i+1)
{
if(number%i==0)
{
counter=counter+1;
break;
}
}
if(counter!=0)
{
System.out.println("Not a primenumber");
}
else
System.out.println("primenumber");
}
}
