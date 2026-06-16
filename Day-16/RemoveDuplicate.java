import java.util.Scanner;
public class RemoveDuplicate {
    
}
  public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int i;
        int j;
        int dup=0;
      
        System.out.println("Enter no of elements");
        k=in.nextInt();
        int a=0;
        for(i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        } 
        for(i=0;i<k;i++)
        {
          for(j=i+1;j<k;j++)
          {
            if(array[i]==array[j])
            {
             
              for(int s=j;s<k;s++)
              {
                array[j]=array[j+1];

              }
            }
          }

        }
        for(i=0;i<k;i++)
        {
          System.out.println(array[i]);
        }
      }
