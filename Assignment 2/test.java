class Complex
{
    double real, img;
    Complex(double x, double y)
    {
        real = x; img = y;
    }
    void add(Complex z)
    {
        this.real += z.real;
        this.img += z.img;
    }
    void subtract(Complex z)
    {
        this.real -= z.real;
        this.img -= z.img;
    }
    void multiply(Complex z)
    {
        Complex tmp = new Complex(this.real*z.real - this.img*z.img, this.real*z.img + this.img*z.real);
        this.real = tmp.real;
        this.img = tmp.img;
    }
    void divide(Complex z)
    {
        double z_abs = z.real*z.real + z.img*z.img;
        z = new Complex(z.real/z_abs, -z.img/z_abs);
        this.multiply(z);
    }
    void display()
    {
        System.out.printf("%f+j%f\n", this.real, this.img);
    }
}
public class test
{
    public static void main(String[] args) 
    {
        double a1 = Double.parseDouble(args[0]);
        double a2 = Double.parseDouble(args[1]);
        double a3 = Double.parseDouble(args[2]);
        double a4 = Double.parseDouble(args[3]);
        Complex a = new Complex(a1, a2);
        Complex b = new Complex(a3, a4);
        a.add(b);
        System.out.println("Result for addition:");
        a.display();
        a.real = a1; a.img = a2;
        a.subtract(b);
        System.out.println("Result for subtraction:");
        a.display();
        a.real = a1; a.img = a2;
        a.multiply(b);
        System.out.println("Result for multiplication:");
        a.display();
        a.real = a1; a.img = a2;
        a.divide(b);
        System.out.println("Result for division:");
        a.display();
    }
}