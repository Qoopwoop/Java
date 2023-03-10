public class Atranspose
{
public static void main(String args[])
{
//two array for two dimensional 
int a[][]={ {1,2,3},{4,5,6},{7,8,9}};
int x[][]=new int [3][3];
//a.length indicates rows count 
for(int i=0;i<a.length;i=i+1)
{
//a[i].length indicates the column count of 1st row 
for(int j=0;j<a[i].length;j=j+1)
{
x[i][j]=a[j][i];
System.out.print(x[i][j]+" ");
}
System.out.println();
}
}
}