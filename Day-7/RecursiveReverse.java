import java.util.Scanner;
public class RecursiveReverse {
    public static int Rev(int n)
    {
        int k=0;
        while(n>0)
        {
            k=(k*10)+(n%10);
            n=n/10;

        }
        return k;
    }
    public static void main(String args[])
    {
        int x;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        System.out.println("the reverse no is: " +Rev(x));


    }
}
