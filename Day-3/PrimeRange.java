import java.util.Scanner;

public class PrimeRange {
    public static void main(String args[]) {
        int range;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        range = in.nextInt();
        for(int n=1;n<=range;n++)
        {
            int k=0;
            for(int i=1;i<=n;i++)
            {
                
                if(n%i==0)
                {
                    k=k+1;


                }
            }
            
                if(k<=2)
                {
                    System.out.println("prime no; " +n);
                }
            
            
        }
    
}
}
