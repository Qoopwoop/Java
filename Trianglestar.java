public class Trianglestar
{
public static void main(String args[])
{

int n=5;

for(int i=1;i<=n;i=i+1)
{

for(int j=i;j<=n;j=j+1)
{
System.out.print(" ");
}



for(int j=1;j<=i;j=j+1)
{
System.out.print("* ");
}

System.out.println( );

}

// Second for triangle 

for(int i=1;i<=5;i=i+1)
{

for(int j=1;j<=i;j=j+1)
{
System.out.print(" ");
}



for(int j=i;j<=5;j=j+1)
{
System.out.print("* ");
}

System.out.println(" ");

}
}
}


