import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int rem=0;
        int k=0;
        while(n>0)
        {
            rem=n%10;
            k=(k*10)+rem;
            n=n/10;
        }
        System.out.println("The reverse is " +k);
    }

}
