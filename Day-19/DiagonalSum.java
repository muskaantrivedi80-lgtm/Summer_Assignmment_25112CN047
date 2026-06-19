import java.util.Scanner;

public class DiagonalSum {
     public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows=in.nextInt();
        System.out.println("Enter no of columns:");
        int columns=in.nextInt();
        int matrix[][]=new int[rows][columns];
        
        int diagonal=0;
        System.out.println("enter first matrix elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               matrix[i][j]=in.nextInt();
            }
        }
       
        for(int i=0;i<rows;i++)
        {
           
                diagonal+=matrix[i][i];
            }
        
        
         
            System.out.println("the diagonal sum is;"+diagonal);

         }
        }
    

        




