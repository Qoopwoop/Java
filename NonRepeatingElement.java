public class MergeDupSort
{
public static void main(String args[])
{
int a[]={11,2,3,56,34,23,6,5};
int b[]={45,76,34,23,12,66,44};
for(int i=0;i<a.length;i=i+1)
{
for(int j=0;j<b.length;j=j+1)
{
if(a[i]==b[j])
{
System.out.println(b[j]);
}
}
}
}
}public class NonRepeatingElement
{

public static void main(String args[])
{
int a[]= {-1,2,-1,3,0};

    abc: for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]!=a[j])
                {
                System.out.println("First non-repeating element is: "+a[i]);
                break abc;
                }
        }
    }

}
}