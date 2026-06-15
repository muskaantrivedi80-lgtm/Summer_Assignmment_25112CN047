import java.util.Scanner;

public class MoveZeros {
     public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int i;
        System.out.println("Enter no of elements");
        k=in.nextInt();
        int a=0;
        for(i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        } 
        for(i=0;i<k;i++)
        {
            if(array[i]==0)
            {
                for(int j=i;j<k;j++)
                {
                    array[j]=array[j+1];
                    array[k]=0;
                }
            }
        }
            for(i=0;i<k;i++)
            {
                System.out.println(array[i]);
            }
            

        
}
}
