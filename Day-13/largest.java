import java.util.Scanner;

public class largest {
    public static void main(String args[])
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        
        System.out.println("Enter no of elements");
        k=in.nextInt();
        for(int i=0;i<k;i++)
        {
            System.out.println("enter element");
            array[i]=in.nextInt();
        }
        int l=array[0];
        int s=array[0];
        for(int i=0;i<k;i++)
        {
           
            if(array[i]>l){
                l=array[i];
            }
           
        }
        
            for(int i=0;i<k;i++)
            {
               
            if(array[i]<s)
            {
                s=array[i];
            }
            
        }
        
        System.out.println("largest="+l+ "smallest="+s);
    }
}
