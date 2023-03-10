public class Dia
{
public static void main(String args[])
    
{
int rows = 3;
int count = 1;
for (int i = 1; i <= 2 * rows - 1; i++)
{ 
 for (int j = count; j <= rows; j++) 
{
                
System.out.print("  ");
}

for (int k = 1; k <= count * 2 - 1; k++) 
{
               
 System.out.print("* ");
            
}
            
if (i < rows)
            
{
                
count++;
             
}
            
else
            
{
                
count--;
}
            
System.out.println("");
}
}
}