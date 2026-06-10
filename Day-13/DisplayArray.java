import java.util.Scanner;
public class DisplayArray {
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
        for(int i=0;i<k;i++)
        {
            System.out.println(array[i]);
        }
    }

    
}
