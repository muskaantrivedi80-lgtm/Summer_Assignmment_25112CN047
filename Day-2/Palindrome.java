import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int num=n;
        int k=0;
        int rem=0;
        while(num>0)
        {
            rem=num%10;
            k=(k*10)+rem;
            num=num/10;

        }
        if(k==n)
            System.out.println("the no is palindrome");

        
        else 
        
            System.out.println("the no is not palindrome");
        
    }
}
