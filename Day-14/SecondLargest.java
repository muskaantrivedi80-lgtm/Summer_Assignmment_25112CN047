import java.util.Scanner;

public class SecondLargest {
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
        int l1=array[0];
        int l2=array[0];
        int temp=array[0];
        for(i=0;i<k;i++)
        {
            if(array[i]>l1)
            {
                l1=array[i];
                temp=array[0];
                array[0]=array[i];
                array[i]=temp;
            }
        }
        for(i=1;i<k;i++)
        {
            if(array[i]>l2)
            {
                l2=array[i];
                
            }
        }
        System.out.println(l2);
       
            
        
        in.close();

       
    }
    
}

