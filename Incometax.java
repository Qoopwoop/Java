public class Incometax
{
    double taxAmount,taxPercent;

    void taxAmount(double salary, double taxPercent) 
        {
taxAmount= salary * (taxPercent/100);
         System.out.println("Your income tax amount is : "+ taxAmount);
}
   
 IncomeTax(double salary) 
 {
    if(salary>=1 && salary<=250000)
    {System.out.println("Hurray! You got exemption from income tax!!!");
    }
    else if(salary>=250001 && salary<=500000)
    {
    taxAmount(salary, 5);
    }
    else if(salary>=500001 && salary<=750000)
    {taxAmount(salary, 10);
    }
    else if(salary>=750001 && salary<=1000000)
    {taxAmount(salary, 15);
    }
    else if(salary>=1000001 && salary<=1250000)
    {taxAmount(salary, 20);
    }
    else if(salary>=1250001 && salary<=1550000)
    {taxAmount(salary, 25);
    }
    else if(salary>=1500001)
    {taxAmount(salary, 30);
    }
 }
public static void main(String args[])
{

    IncomeTax obj = new IncomeTax(5000000);
}
}