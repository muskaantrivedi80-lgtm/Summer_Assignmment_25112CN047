import java.util.Scanner;
public class Factorial {
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
          k=k+rem;
          n=n/10;

         }
     System.out.println("the sum of digits is " +k);
        }
}
