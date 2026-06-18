import java.util.Scanner;

public class BinarySearch {
      public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int mid;
        int n;
        int f=0;
        
        System.out.println("Enter the no to search");
        n=in.nextInt();

         System.out.println("Enter no of elements");
        k=in.nextInt();
        int l=k-1;
        
        for(int i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        } 
        
        while(l>f)
        {
            mid=(f+l)/2;
            if(n==array[mid])
            {
                System.out.println(mid);
                break;
            }
            else if(n>array[mid])
            {
                f=mid+1;

            }
            else
            {
                l=mid-1;
            }
        }
    }


}
