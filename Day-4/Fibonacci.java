import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        for(int i=0;i<=n;i++)
        {
             temp=a+b;
        
            
            a=b;
            b=temp;
            System.out.println("the series is " +temp);
        }
    }

}
