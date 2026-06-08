import java.util.Scanner;

public class FunctionMax {
     public static int Max(int a,int b)
    {
        int max=0;
        if(a>b)
        {
            max=a;
        }
        else 
        {
            max=b;
        }
        System.out.println("the maximum no is:" +max);
        return 0;
    } 
    public static void main(String args[])
    {
        int n;
        int m;
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
        m=in.nextInt();
        Max(n,m);
    }
    
}


