import java.util.Scanner;

public class OddEven {
    public static void main(String args[])
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        System.out.println("Enter no of elements");
        k=in.nextInt();
        for(int i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<k;i++)
        {
            if(array[i]%2==0)
            {
                even=even+1;
            }
            else
            {
                odd=odd+1;
            }
        }
        System.out.println("odd=" +odd+ "even=" +even);
    }
}
