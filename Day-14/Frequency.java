import java.util.Scanner;

public class Frequency {
    public static void main(String args[])
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int i=0;
        System.out.println("Enter no of elements");
        k=in.nextInt();
        int a=0;
        for(i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        }
        int m;
        System.out.println("enter the no to search");
        m=in.nextInt();
        for( i=0;i<k;i++)
        {
            if(array[i]==m)
            {
                a=a+1;
            

            }
        }
            System.out.println("the frequency is:"+a);
    }
}
