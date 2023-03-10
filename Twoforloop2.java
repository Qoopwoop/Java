public class Twoforloop2
{
public static void main(String args[])
{
//two array for two dimensional 
int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
//a.length indicates rows count 
for(int i=0;i<a.length;i=i+1)
{
//a[i].length indicates the column count of 1st row 
for(int j=0;j<a[i].length;j=j+1)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}