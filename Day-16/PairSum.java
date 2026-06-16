import java.util.Scanner;

public class PairSum {
     public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int i;
        int j;
        
        System.out.println("Enter no of elements");
        k=in.nextInt();
        int a=0;
        for(i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        } 
        int n;
        System.out.println("enter the no to find pair with given sum");
        n=in.nextInt();
        for(i=0;i<k;i++)
        {
            for(j=i;j<k;j++)
            {
                if(n==array[i]+array[j])
                {
                    System.out.println(array[i]+","+array[j]);
                }
            }
        }
}
}
