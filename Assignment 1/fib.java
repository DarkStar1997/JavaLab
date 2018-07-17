class fib
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int a = -1, b = 1;
        while(n-- > 0)
        {
            int c = a + b;
            System.out.println(c);
            a = b; b = c;
        }    
    }
}