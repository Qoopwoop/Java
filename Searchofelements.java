public class Searchofelements
{
public static void main(String args[])
{
int z[]={7,3,5,4,2,1,10,89,99,67,34};
boolean flag=false;
//To search the given number in an array 
int search=10;
for(int i=0;i<z.length;i=i+1)
{
if(search==z[i])
{
flag=true;
System.out.println("Search of an elements in array:  + z["+i+"]");
}
}
System.out.println(flag);

}
}
