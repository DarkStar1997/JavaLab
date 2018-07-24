import java.util.*;
class Shape
{
    double calcArea(double radius)
    {
        return Math.PI * radius * radius;
    }
    double calcArea(double a, double b, double c)
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double calcArea(double length, double breadth)
    {
        return length * breadth;
    }
}
class Test
{
    public static void main(String[] args) 
    {
        System.out.println("1-Circle\n2-Triangle\n3-Rectangle");    
        System.out.println("Input choice");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) 
        {
            case 1: System.out.println("Enter radius");
                    double radius = sc.nextDouble();
                    Shape circle = new Shape();
                    System.out.println("Area = "+circle.calcArea(radius));
                    break;
            case 2: System.out.println("Enter the length of the three sides");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    double c = sc.nextDouble();
                    Shape triangle = new Shape();
                    System.out.println("Area = "+triangle.calcArea(a, b, c));
                    break;
            case 3: System.out.println("Enter the length and breadth");
                    double a1 = sc.nextDouble();
                    double b1 = sc.nextDouble();
                    Shape rectangle = new Shape();
                    System.out.println("Area = "+rectangle.calcArea(a1, b1));
                    break;
            default:
                break;
        }
    }
}