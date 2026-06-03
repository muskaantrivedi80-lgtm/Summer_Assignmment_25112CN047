import java.util.Scanner;

public class RecursiveFactorial 
{
    public static int fact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else 
        {
            return n*fact(n-1);
        }
    }
    


public static void main(String args[])
{
    int x;
    Scanner in= new Scanner(System.in);
    x=in.nextInt();
    System.out.println("the factorial is " +fact(x));

}
}

