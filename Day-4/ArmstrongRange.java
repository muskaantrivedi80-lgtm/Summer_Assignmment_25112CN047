import java.util.Scanner;

public class ArmstrongRange {
 public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        for(int i=0;i<n;i++)
        {
              int number=(int)Math.log10(i)+1;
        int temp=i;
            int k=0;
            int rem=0;
            while(temp>0)
            {
                rem=temp%10;
                k=(int)Math.pow(rem,number)+k;
                temp=temp/10;
            }
            if(k==i)
            {
                System.out.println(i);
            }
        }
        
 }
}
