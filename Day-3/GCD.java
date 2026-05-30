import java.util.Scanner;

public class GCD {
    public static void main(String args[]) {
        int n;
        int s;
        int k=0;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter two number");
        n = in.nextInt();
        s= in.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0&&s%i==0)
            {
                k=i;

            }
        }
        System.out.println("the gcd is " +k);
    }
}
