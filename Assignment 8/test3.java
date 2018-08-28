interface int1
{
    void method1();
}
interface int2
{
    void method2();
}
interface int3 extends int1, int2
{
    void method3();
}
class Concrete
{
    void ConcreteMethod()
    {
        System.out.println("This is concrete method from class Concrete");
    }
}
class Derieved extends Concrete implements int3
{
    public void method1()
    {
        System.out.println("This is method1 from interface 1");
    }
    public void method2()
    {
        System.out.println("This is method2 from interface 2");
    }
    public void method3()
    {
        System.out.println("This is method3 from interface 3");
    }
    void method(int1 a)
    {
        method1();
    }
    void method(int2 a)
    {
        method2();
    }
    void method(int3 a)
    {
        method3();
    }
}
class Test
{
    public static void main(String args[])
    {
        int1 a = null;
        int2 b = null; 
        int3 c = null;
        Derieved obj = new Derieved();
        obj.method(a);
        obj.method(b);
        obj.method(c);
        obj.ConcreteMethod();
    }
}
