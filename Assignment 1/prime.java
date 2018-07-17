class prime
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        boolean primes[] = new boolean[n+1];
        for(int i = 2; i*i <= n; i++)
            if(!primes[i])
                for(int j = i * i; j <= n; j += i)
                    primes[j] = true;
        for(int i = 2; i <= n; i++)
            if(!primes[i])
                System.out.println(i);    
    }
}