import java .util.Scanner;
public class Perfect {
  public static void main(String args[]) {
        int n;
        int k=0;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();   
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                k=k+i;
        }
        if(k==n)
        {
            System.out.println("The number is perfect");
        }
        else
        {
            System.out.println("not perfect");
        }
}
}
