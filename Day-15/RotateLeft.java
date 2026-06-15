import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args)
    {
        int k;
        Scanner in=new Scanner(System.in);
         int i;
        System.out.println("Enter no of elements");
        k=in.nextInt();
        int array[]=new int[50];
        int a=0;
        for(i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        } 
         array[k]=array[0];
        for(i=0;i<k;i++)
        {
            
            array[i]=array[i+1];
        }
        for(i=0;i<k;i++)  
            {
                System.out.println(array[i]);
            } 
        
}
}
