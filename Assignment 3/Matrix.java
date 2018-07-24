import java.util.*;
class Matrix
{
    int rows, cols;
    double arr[][];
    Matrix(int x, int y)
    {
        rows = x;
        cols = y;
        arr = new double[rows][cols];
    }
    void input()
    {
        for(int i = 0; i < rows; i++)
            for(int j = 0; j< cols; j++)
                arr[i][j] = new Scanner(System.in).nextDouble();
    }
    void add(Matrix obj)
    {
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                arr[i][j] += obj.arr[i][j];
    }
    void display()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
}
class Test
{
    public static void main(String[] args) 
    {
        int x, y;
        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        Matrix obj = new Matrix(x, y);
        Matrix obj1 = new Matrix(x, y);
        System.out.println("Enter the first matrix");
        obj.input();
        System.out.println("Enter the second matrix");
        obj1.input();
        obj.add(obj1);
        System.out.println("The answer is:");
        obj.display();
    }
}