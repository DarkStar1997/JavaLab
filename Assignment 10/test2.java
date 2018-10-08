import java.io.*;
class test
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try
        {
            n = Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Error in data entry");
        }
    }
}