public class Occurance
{
public static void main(String args[])
{
int a[]={5,6,3,55,5,36,5,33,77,99,5,90};
int count=0;
for(int i=0;i<a.length;i=i+1)
{
if(a[i]==5)
{
count=count+1;
System.out.println("a["+i+"]"+a[i]);
}
}
System.out.println("count of 5 in this array  :"+count);
}
}