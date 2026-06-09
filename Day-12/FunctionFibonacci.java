import java.util.Scanner;

public class FunctionFibonacci {
    public static void Fibonacci(int n)
    {
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++)
        {
        int sum=a+b;
        a=b;
        b=sum;
        System.out.println(sum);
        }


        return ;
    }
    
    public static void main(String args[])
    {
        int x;
        
        Scanner in=new Scanner(System.in);
        
        x=in.nextInt();
       Fibonacci(x);
    }
}
