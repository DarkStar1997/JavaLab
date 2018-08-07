import java.util.*;
class Timer
{
    int hour, min, sec;
    Timer()
    {
        hour = 0;
        min = 0;
        sec = 0;
    }
    Timer(int a, int b, int c)
    {
        hour = a;
        min = b;
        sec = c;
    }
    static Timer add(Timer obj1, Timer obj2)
    {
        Timer ans = new Timer();

        ans.sec = obj1.sec + obj2.sec;
        ans.min += (ans.sec / 60);
        ans.sec %= 60;
        
        ans.min += obj1.min + obj2.min;
        ans.hour += (ans.min / 60);
        ans.min %= 60;

        ans.hour += obj1.hour + obj2.hour;
        return ans;
    }
    void display()
    {
        System.out.printf("hh: %d min: %d sec: %d\n", hour, min, sec);
    }
}
class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Timer obj1 = new Timer(a, b, c);
        System.out.println("Enter second time:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Timer obj2 = new Timer(a, b, c);
        Timer obj3 = Timer.add(obj1, obj2);
        System.out.println("Added time is:");
        obj3.display();
    }
}