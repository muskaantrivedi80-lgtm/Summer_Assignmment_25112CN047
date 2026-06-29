import java.util.Scanner;

public class MergeArray {
     public static void main(String args[])
    {
        int array1[]=new int[50];
        int array2[]=new int[50];
       
        Scanner in=new Scanner(System.in);
        int k;
        
        System.out.println("Enter no of elements");
        k=in.nextInt();
        int l;
        int i;
        int j;
        System.out.println("enter no of elements in second array");
        l=in.nextInt();
        for(i=0;i<k;i++)
        {
            array1[i]=in.nextInt();
        }
        for(j=0;j<l;j++)
            {
                array2[j]=in.nextInt();
            }  
            for(i=0,j=0;i<k&&j<l;)
                {
                    
                        if(array1[i]<=array2[j])
                        {
                           System.out.print(array1[i]);
                           i++;
                        }
                        
                        else
                        {
                            System.out.print(array2[j]);
                          j++;
                } 
            }
            
            
            for(;i<k;i++)
            {
                System.out.print(array1[i]);

            }
            for(;j<l;j++)
            {
                System.out.print(array2[j]);
            }
        }
                }
            

              
        
    

