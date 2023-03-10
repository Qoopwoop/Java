public class DiagonalElements
{
public static void main(String args[])
{
//two array for two dimensional 
int a[][]={ {45,32,21},{25,76,55},{67,87,99}};
//a.length indicates rows count 
for(int i=0;i<a.length;i=i+1)
{
//a[i].length indicates the column count of 1st row 
for(int j=0;j<a[i].length;j=j+1)
{
if(i==j)
{
System.out.print(a[i][j]+"\t");
}
else
{
System.out.print(0+"\t");
}
}
System.out.println();
}
}
}