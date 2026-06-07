import java.util.Scanner;
public class NoPyramid
{
public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for(int s=i-1;s>=1;s--)
            {
                System.out.print(s);
            }
            System.out.println();
}
    }
}

