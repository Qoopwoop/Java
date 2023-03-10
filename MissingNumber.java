public class MissingNumber
{
public static void main(String args[])
{
//two array for two dimensional 
int a[]={1,2,4,6,3,7,8};
int sum1=0;
int sum2=0;
for(int i=0;i<a.length;i++)
{
sum1=sum1+a[i];
}
System.out.println("Sum of the elements:" +sum1);
for(int i=1;i<=8;i++)
{
sum2=sum2+i;
}
System.out.println("Sum of range of elements:" +sum2);
System.out.println("missing elements:" +(sum2-sum1));
}
}