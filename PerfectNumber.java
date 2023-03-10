public class PerfectNumber
{
public static void main(String args[])
{
for(int number=1;number<=100;number=number+1)
{
int sum=0;
for(int i=1;i<=number/2;i=i+1)
{
if(number%i==0)
{
sum=sum+i;
}
}
if(number==sum)
{
System.out.println("perfectnumber:" +  number);
}
}
}
}

