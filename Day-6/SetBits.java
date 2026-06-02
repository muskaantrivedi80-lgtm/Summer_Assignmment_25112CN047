import java.util.Scanner;

public class SetBits {
     public static void main(String args[]) {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int rem=0;
        int setbits=0;
        while(n>0)
        {
            rem=n%2;
            n=n/2;
            if(rem==1)
            {
                setbits=setbits+1;
            }
        }
        System.out.println("the total no of set bitss is " +setbits);
}

}