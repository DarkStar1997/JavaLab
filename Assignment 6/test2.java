package pkg1;
import pkg.*;
public class test2 extends test
{
    test2()
    {
        System.out.print(pub_int);
        System.out.print(pro_int);
        //System.out.print(def_int);
        //System.out.print(pri_int);
    }
    public static void main(String[] args) 
    {
        test2 obj = new test2();
    }
}
