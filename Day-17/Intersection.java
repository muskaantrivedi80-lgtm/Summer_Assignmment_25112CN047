import java.util.Scanner;

public class Intersection {
     public static void main(String[] args)
    {
        int array1[]=new int[50];
        int array2[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int s;
        int elements=0;
        int array3[]=new int[50];
        System.out.println("Enter no first of elements");
        k=in.nextInt();
        System.out.println("Enter no second of elements");
        s=in.nextInt();
        System.out.println("Enter first array elements");
        for(int i=0;i<k;i++)
        {
            array1[i]=in.nextInt();
        } 
        System.out.println("Enter second array elements");
        for(int j=0;j<s;j++)
        {
            array2[j]=in.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(array1[i]==array2[j])
                {
                   
                     array3[elements]=array1[i];
                     elements=elements+1;
                }


            }
        }
        for(int i=0;i<elements;i++)
        {
            System.out.println(array3[i]);
        }
}
}
