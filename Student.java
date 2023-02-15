public class Student
{
int stuRollno;
double stuMark;
String stuName;
char stuGrade;
Student(int stuRollno,double stuMark,String stuName,char stuGrade)
{
this.stuRollno=stuRollno;
this.stuMark=stuMark;
this.stuName=stuName;
this.stuGrade=stuGrade;
}
Student(int stuRollno,String stuName,char stuGrade)
{
this.stuRollno=stuRollno;
this.stuName=stuName;
this.stuGrade=stuGrade;
}
public void display()
{
System.out.println(stuRollno+" "+stuMark+" "+stuName+" "+stuGrade);
}
public static void main(String args[])
{
Student s1=new Student(91,90,"Arsh",'A');
Student s2=new Student(92,"Rex",'B');
Student s3=new Student(93,65,"Tej",'c');
s1.display();
s2.display();
s3.display();
}
}
