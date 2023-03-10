public class Temperature
{
public static void main(String args[])
{
Temperature obj=new Temperature();
obj.Temp(107.3);
}
double Temp(double temp)
{
if(temp<95)
{
System.out.println("too cold ");
}
else 
if(temp<98)
{
System.out.println("Normal");

}
else
if(temp<102)
{
System.out.println("Fever");
}
else
if(temp<106)
{
System.out.println("High Fever !!!!");
}
else
{
System.out.println("Recognized disease");
}
return temp;
}
}