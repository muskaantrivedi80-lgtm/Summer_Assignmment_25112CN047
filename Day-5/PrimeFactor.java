import java.util.Scanner;

public class PrimeFactor {
     public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int a=0;
        
        for(int i=1;i<=n-1;i++)
        {
            
            if(n%i==0)
            {
                a=i;
            }
                
        
    }
    System.out.println("the largest primt factor is:" +a);
    }
}
