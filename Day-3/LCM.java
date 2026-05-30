import java.util.Scanner;

public class LCM {
    public static void main(String args[]) {
        int n;
        int s;
        int i=0;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter two number");
        n = in.nextInt();
        s=in.nextInt();
        for(i=1;i<=n*s;i++)
        {
            if(i%n==0&&i%s==0)
            {
                break;
            }
        }
        System.out.println("the lcm is " +i);
    }

}
