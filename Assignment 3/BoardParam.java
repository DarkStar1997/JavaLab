import java.util.*;
class BoardParam
{
    double len, width, area;
    BoardParam(double x, double y)
    {
        len = x;
        width = y;
    }
    void CalcArea()
    {
        area = len * width;
    }
    void display()
    {
        System.out.println("Area = "+area);
    }
}
class Test
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("Enter the length");
        x = sc.nextDouble();
        System.out.println("Enter the width");
        y = sc.nextDouble();
        BoardParam obj = new BoardParam(x, y);
        obj.CalcArea();
        obj.display();
    }
}