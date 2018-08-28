import java.util.Scanner;
abstract class Shape
{
    abstract void disp();
    abstract void area();
}
class Rectangle extends Shape
{
    double x, y, a;
    Rectangle(double len, double width)
    {
        x = len;
        y = width;
    }
    void area()
    {
        a = x * y;
    }
    void disp()
    {
        System.out.println("The area of the rectangle is: "+a);
    }
}
class Circle extends Shape
{
    double r, a;
    Circle(double radius)
    {
        r = radius;
    }
    void area()
    {
        a = Math.PI * r * r;
    }
    void disp()
    {
        System.out.println("The area of the circle is: "+a);
    }
}
class Triangle extends Shape
{
    double x, y, z, a;
    Triangle(double len, double width, double height)
    {
        x = len;
        y = width;
        z = height;
    }
    void area()
    {
        double s = (x + y + z) / 2;
        a = Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }
    void disp()
    {
        System.out.println("The area of the triangle is: "+a);
    }
}
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Rectangle\n2-Circle\n3-Triangle\nInput choice (1/2/3)");
        int ch = sc.nextInt();
        Shape obj;
        switch(ch)
        {
            case 1: System.out.println("Enter length and breadth of the rectangle");
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    obj = new Rectangle(x, y);
                    obj.area();
                    obj.disp();
                    break;
            case 2: System.out.println("Enter the radius of the circle");
                    x = sc.nextDouble();
                    obj = new Circle(x);
                    obj.area();
                    obj.disp();
                    break;
            case 3: System.out.println("Enter length, breadth and height of the triangle");
                    x = sc.nextDouble();
                    y = sc.nextDouble();
                    double z = sc.nextDouble();
                    obj = new Triangle(x, y, z);
                    obj.area();
                    obj.disp();
                    break;
        }
    }
}
