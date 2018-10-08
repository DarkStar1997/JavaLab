import java.util.Scanner;
class NegativeNumber extends Exception
{
    public NegativeNumber()
    {
        super("You have entered a negative number!!!");
    }
}
class test
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try
        {
            if(n < 0)
                throw new NegativeNumber();
            int ans = 1;
            for(int i = 2; i <= n; i++)
                ans *= i;
            System.out.println(ans);
        }
        catch(NegativeNumber ex)
        {
            System.out.println("NegativeNumber exception caught");
            ex.getMessage();
        }
    }
}