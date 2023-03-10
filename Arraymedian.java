public class Arraymedian
{
public static void main(String args[])
{
int a[]={9,3,1,8,3,6},b=0,c=0;
int sum=0;
int median=0;
for(int i=0;i<a.length;i=i+1)
{
if(a.length%2==1)
{
c =(a[(a.length/2)-1]);
b =(a[(a.length/2)]);
System.out.println(a[(a.length/2)-1]);
}
else
{
System.out.println(a[(a.length/2)]);
median=c+b/2;
System.out.println(median);
}
}
}
}



