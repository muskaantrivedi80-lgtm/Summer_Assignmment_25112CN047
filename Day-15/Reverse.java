
import java.util.Scanner;
public class Reverse {
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
        
        int temp=0;
        for(i=0,j=k-1;i<j;i++,j--)
        {
           temp=array[i];
           array[i]=array[j];
           array[j]=temp; 
        }
        for(i=0;i<k;i++)
        {
            System.out.println(array[i]);
        }
}
}