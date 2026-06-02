import java.util.Scanner;

public class DecimalToBinary {
     public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int k=0;
        int rem=0;
        int pow=1;
        while(n>0)
        {
            rem=n%2;
            n=n/2;
            k= k+pow*rem;
            pow=pow*10;


        }
        System.out.println("the no is " +k);
    }
    
}
