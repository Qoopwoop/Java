public class StoringOddNEven
{
 int arr[]= {1,2,4,3,5,7,6,8,9,2,3,4,8};
 int even[] = new int[arr.length];
 int odd[] = new int[arr.length];

void split()
{
 for(int i=0;i<arr.length;i=i+1)
    {
     if(arr[i]%2==0)    
        {
         even[i]=arr[i];        
        }
     else if(arr[i]%2!=0)
        {
         odd[i]=arr[i];
        }
    }

 for(int i: odd)
    {if(i!=0)
        {System.out.println("Odd array values are "+ i);}
    }

  for(int i: even)
    {if(i!=0)
        {System.out.println("even array values are "+ i);}
    }
}
public static void main(String args[])
{

 StoringOddNEven obj= new StoringOddNEven();
 obj.split();

}}