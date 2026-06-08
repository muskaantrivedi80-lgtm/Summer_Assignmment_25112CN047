import java.util.Scanner;

public class FunctionPrime {
     public static int Prime(int a)
    {
        int k=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                k=k+1;
            }
        }
            if(k>2)
            {
                System.out.println("the no is not prime");
            }
            else
            {
                System.out.println(" prime");
            }
        
        return 0;
    } 
    public static void main(String args[])
    {
        int n;
        
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
        
        Prime(n);
    }
    
}


