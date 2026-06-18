
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int temp=0;
         System.out.println("Enter no of elements");
        k=in.nextInt();
        
        for(int i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        } 
        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
            if(array[j]>array[j+1])
            {
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }


        }
        for(int i=0;i<k;i++)
        {
             System.out.println(array[i]);

        }
}
}
