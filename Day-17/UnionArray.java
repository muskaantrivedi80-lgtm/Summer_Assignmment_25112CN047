import java.util.Scanner;

public class UnionArray {
      public static void main(String[] args)
    {
        int array1[]=new int[50];
        int array2[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int s;
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
               for(int l=j;l<s;l++)
               {
                    array2[l]=array2[l+1];
               }

          }
        }
     }
     for(int i=k, j=0;i<k+s&&j<s;i++,j++)
     {
          array1[i]=array2[j];
     }
     for(int i=0;i<k+s;i++)
     {
          System.out.println(array1[i]);
     }
}
}