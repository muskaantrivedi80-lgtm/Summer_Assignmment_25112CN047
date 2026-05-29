import java.util.Scanner;
public class ProductOfDigits {
  public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt(); 
        int rem=0;
        int k=1;
        while(n>0)
        {
                rem=n%10;
                k=k*rem;
                n=n/10;
        }
        System.out.println("the product of number is " +k);
}
    
}
