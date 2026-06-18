import java.util.Scanner;

public class SelectionSort {
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
         for(int i=0;i<k;i++)
         {
            for(int j=i;j<k;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
         }
         for(int i=0;i<k;i++)
         {
            System.out.println(array[i]);
         }
}
}
