import java.util.Scanner;

public class BinaryToDecimal {
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
            rem=n%10;
            n=n/10;
            k=rem*pow+k;
            pow=pow*2;

            }
        
        System.out.println("the decimal no is " +k);
    }
}
    

