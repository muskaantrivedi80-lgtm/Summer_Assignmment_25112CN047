import java.util.Scanner;

public class Strong {
     public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int rem=0;
        
        int num=n;
        int sum=0;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            int k=1;
            for(int i=1;i<=rem;i++)
            {
                k=k*i;

            }
             sum=sum+k;
        }
        if(sum==n)
        {
            System.out.println(" the no is strong");

        }
        else 
        {
            System.out.println("the no is not strong");
        }
}
}
