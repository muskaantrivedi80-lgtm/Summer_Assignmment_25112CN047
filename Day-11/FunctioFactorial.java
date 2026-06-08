import java.util.Scanner;

public class FunctioFactorial {
     public static void Fact(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial is:" +fact);
        return;
    } 
    public static void main(String args[])
    {
        int n;
        
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
       Fact(n); 
       
    }
    
}


