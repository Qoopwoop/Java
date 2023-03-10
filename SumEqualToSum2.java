public class SumEqualToSum2
{
public static void main(String args[])
{
//two array for two dimensional 
int arr[]={1,5,7,-1,5};
int sum=6;
int counter=0;
for(int i=0;i<arr.length;i++)
{
for(int j=i;j<arr.length;j++)
{
if(arr[i]+arr[j]==sum)
{
counter++;
}
}
}
System.out.println(counter);
}
}