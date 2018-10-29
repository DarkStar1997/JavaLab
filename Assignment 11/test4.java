class Odd extends Thread
{
   public void run()
   {
       for(int i=1;i<10;i=i+2)
       {
           System.out.println(i);
           try {Thread.sleep(1000);}
           catch(Exception e){}
       }

   }
}
class Even implements Runnable
{
   public void run()
   {
       for(int i=2;i<=10;i=i+2)
       {
           System.out.println(i);
           try {Thread.sleep(1000);}
           catch(Exception e){}
       }

   }
}
class test
{
  public static void main(String args[])
  {
      Odd obj1 = new Odd();
      Runnable obj2= new Even();
      Thread t = new Thread(obj2);
      obj1.start();
      try {Thread.sleep(10);}
      catch(Exception e){}
      t.start();
  }
}