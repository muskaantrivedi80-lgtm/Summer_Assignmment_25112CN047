import java.util.Scanner;

public class RecursiveFibonacci
 {
    public static int fib(int n)
    {
        if(n==0)
        {
            return 0;

        }
        if(n==1)
        {
            return 1;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
        
        
    }
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        for(int i=0;i<=x;i++)
        {
        System.out.println("The Fibonacci series is :" +fib(i));
        }
    }

    
}
