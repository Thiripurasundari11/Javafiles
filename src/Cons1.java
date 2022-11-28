import java.util.Scanner;

public class Cons1
{
public static void main(String[] args)
{
 Scanner obj1 = new Scanner(System.in);

 System.out.println("Enter name:");
 String name = obj1.nextLine();
 System.out.println("Enter id:");
 int id = obj1.nextInt();
 Student1 s1 =  new Student1(name, id);

}
}

class Student1
{
 String name;
 int id;

 Student1(String name1,int id1)
 {
  this.name = name1;
  this.id = id1;
  System.out.println(name);
  System.out.println(id);
 }

}