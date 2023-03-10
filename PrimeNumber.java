public class PrimeNumber
{
public static void main(String args[])
{
for(int number=1;number<=100;number=number+1)
{
boolean flag=false;
for(int i=2;i<=number/2;i=i+1)
{
if(number%i==0)
{
flag=true;
break;
}
}
if(flag)
{
System.out.println("Not a primenumber:"+  number);
}
else
System.out.println("primenumber:" +  number);
}
}
}
