import java.util.*;
class Box
{
	double height, width, depth;
	Box(double x, double y, double z)
	{
		height = x; width = y; depth = z;
	}
	double volume()
	{
		return height * width * depth;
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(double a, double b, double c, double d)
	{
		super(a, b, c);
		weight = d;
	}
}
class BoxShipment extends BoxWeight
{
	double cost;
	BoxShipment(double a, double b, double c, double d, double e)
	{
		super(a, b, c, d);
		cost = e;
	}
	void display()
	{
		System.out.printf("The dimensions of the box are: %f %f %f\n", height, width, depth);
		System.out.printf("The volume, weight and cost is %f %f %f\n", volume(), weight, cost);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e;
		System.out.println("Enter the dimensions of the box");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		System.out.println("Enter the weight of the box");
		d = sc.nextDouble();
		System.out.println("Enter the cost of the box");
		e = sc.nextDouble();
		BoxShipment obj = new BoxShipment(a, b, c, d, e);
		obj.display();
	}
}
