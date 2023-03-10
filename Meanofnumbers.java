public class Arraymean
{
public static void main(String args[])
{
int a[]={9,3,1,8,3,6};
int sum=0;
int mean=0;
for(int i=0;i<a.length;i=i+1)
{
sum=sum+a[i];
}
mean=sum/a.length;
System.out.println(mean);
}
}