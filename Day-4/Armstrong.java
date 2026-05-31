import java.util.Scanner;

public class Armstrong {
     public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int num=n;
        int rem=0;
        double  k=0;
        int s=0;
        
        while(num>0)
        {
            
            num=num/10;
            s=s+1;
        }
         num=n;

        
        while(num>0)
        {
            rem=num%10;
             k= Math.pow(rem,s) +k;
             num=num/10;


        }
    
        if(k==n)
        {
            System.out.println(" no is armstrong");
        }
        else 
        {
            System.out.println("the no is not aremstrong");
        }

    }

}
