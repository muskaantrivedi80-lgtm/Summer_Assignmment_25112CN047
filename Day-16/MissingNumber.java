import java.util.Scanner;
public class MissingNumber {
     public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int i;
        int sum=0;
        int arraysum=array[0];
        int missing=0;
        System.out.println("Enter no of elements");
        k=in.nextInt();
        for(i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        }
        int l=array[0];
        for(i=0;i<k;i++)
            {
                if(array[i]>l)
                {
                    l=array[i];
                }
            } 
            for(i=0;i<k;i++)
            {
                arraysum=arraysum+array[i];

            }
            for(i=0;i<=l;i++)
            {
              sum=sum+i;
            }
            missing=sum-arraysum;
            System.out.println(missing);
        }



}
