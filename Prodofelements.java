public class Prodofelements
{
public static void main(String args[])
{
int b[]={7,3,5,4,2,1};
int prod=1;
for(int i=1;i<b.length;i=i+1)
{
prod=prod*b[i];
} 
System.out.println("Multiply of an elements in an array :" +prod);
}
}