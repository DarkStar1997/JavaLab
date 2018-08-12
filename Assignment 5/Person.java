import java.util.*;
class Person
{
    String hobby = "Reading", name;
    Person(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    void introduce()
    {
        System.out.println("I love "+hobby);
    }
}
class Student extends Person
{
    Student(String name)
    {
        super(name);
        hobby = "Facebook";
    }
}
class CSEStudent extends Student
{
    CSEStudent(String name)
    {
        super(name);
        hobby = "Hacking";
    }
}
class Test
{
    public static void main(String[] args) 
    {
        System.out.println("Enter 1 to introduce before student leaders");
        System.out.println("Enter 2 to introduce before Hacker society");
        System.out.println("Enter 3 to introduce before cousin's birthday");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        String name = sc.next();
        switch(ch)
        {
            case 1: Person obj = new Person(name);
                    obj.introduce();
                    break;
            case 2: CSEStudent obj1 = new CSEStudent(name);
                    obj1.introduce();
                    break;
            case 3: Student obj2 = new Student(name);
                    obj2.introduce();
                    break;
        }
    }
}
