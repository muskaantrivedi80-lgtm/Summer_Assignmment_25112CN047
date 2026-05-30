import java.util.Scanner;
public class Prime {

public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int k=0;
        for(int i=1;i<=n;i++)
        {
                if(n%i==0)
                {
                        k=k+1;
                }
                
        }
        if(k>2)
        {
                System.out.println("no is not prime");
        }
        else{
                System.out.println("no is prime");
        }
}
}