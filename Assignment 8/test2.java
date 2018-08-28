interface VehicleProp
{
    void speedup(int delta);
    void ChangeGear(int x);
    void brake(int delta);
}
class Car implements VehicleProp
{
    int color, gear, speed;
    Car(int a, int b, int c)
    {
        color = a;
        gear = b;
        speed = c;
    }
    public void speedup(int delta)
    {
        speed += delta;
        System.out.println("Speeding up by "+delta);
    }
    public void brake(int delta)
    {
        speed -= delta;
        System.out.println("Reducing speed by "+delta);
    }
    public void ChangeGear(int x)
    {
        gear = x;
        System.out.println("Gear changed to "+x);
    }
}
class Test
{
    public static void main(String args[])
    {
        Car obj = new Car(1, 2, 3);
        obj.speedup(34);
        obj.ChangeGear(2);
        obj.brake(20);
    }
}
