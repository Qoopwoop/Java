
public class PatternAlphaA
{
public static void main(String args[])
{
int i=1;
while(i<=5)
{
int j=1;
while(j<=5)
{
if(i==1||i==3||j==1||j==5)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
j=j+1;
}

System.out.println( );
i=i+1;
}
}
}

