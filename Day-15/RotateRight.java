import java.util.Scanner;

public class RotateRight {
     public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int i;
        int j;
        
        System.out.println("Enter no of elements");
        k=in.nextInt();
        for(i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        }
        
        int temp=array[k-1];
        for(i=k-1;i>0;i--)

        {
            array[i]=array[i-1];   
        }
        array[0]=temp;
        for(i=0;i<k;i++)
        {
        System.out.println(array[i]);
}
    }
}

