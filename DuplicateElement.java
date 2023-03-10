public class DuplicateElement
{
public static void main (String args[])
{
int a[]={7,5,4,5,3,5};
for(int i=0;i<a.length;i=i+1)
{
for(int j=i+1;j<a.length;j=j+1)
{
if(a[i]==a[j])
{
a[j]=0;
}
//System.out.println(i+" " +j);
//System.out.println(a[i]+" "+a[j]);
}
}
for(int i:a)
{
System.out.println(i);
}
}
}
