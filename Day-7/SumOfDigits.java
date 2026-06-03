import java.util.Scanner;

public class SumOfDigits {
    public static int Sum(int n)
    {
    int k=0;
        while(n>0)
        {
            k=k+(n%10);
            n=n/10;
        }
        return k;
            

        }
    
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        System.out.println("the sum is "+ Sum(x));


    }
}


                