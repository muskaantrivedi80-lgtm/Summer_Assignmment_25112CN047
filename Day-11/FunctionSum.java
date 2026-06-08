import java.util.Scanner;
public class FunctionSum {
    public static int Sum(int a,int b)
    {
        int sum=0;
        sum=a+b;
        System.out.println("the sum is:" +sum);
        return 0;
    } 
    public static void main(String args[])
    {
        int n;
        int m;
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
        m=in.nextInt();
        Sum(n,m);
    }
    
}
