 class Animal
{
public void displayinfo()
{
System.out.println("I am an animal");
}
}


 class Dog extends Animal
{
public void displayinfo()
{
System.out.println("I am a dog");
}
}


public class Main
{
public static void main(String[] args)
{
Dog d1=new Dog();
d1.displayinfo();
}
}
