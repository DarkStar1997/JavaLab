class InsufficientBalanceException extends  Exception
{
    InsufficientBalanceException()
    {
        super("Cannot have balance less than 1000");
    }
}
class Account
{
    double balance;
    Account()
    {
        balance = 1000;
    }
    void deposit(double amt)
    {
        balance += amt;
        System.out.println("Your current balance after deposit is Rs "+balance);
    }
    void withdraw(double amt)throws Exception
    {
        if(balance - amt < 1000)
            throw new InsufficientBalanceException();
        balance -= amt;
        System.out.println("Your current balance after withdrawal is Rs "+balance);
    }
}
class test
{
    public static void main(String[] args) throws Exception
    {
        Account obj = new Account();
        try
        {
            obj.deposit(500);
            obj.withdraw(400);
            obj.withdraw(400);
        }
        catch(InsufficientBalanceException exp)
        {
            System.out.println("Insufficient balance exception caught!!!");
            System.out.println(exp.getMessage());
        }
    }
}