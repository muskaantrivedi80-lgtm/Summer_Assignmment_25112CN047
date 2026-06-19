import java.util.Scanner;

public class Transpose {
     public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows=in.nextInt();
        System.out.println("Enter no of columns:");
        int columns=in.nextInt();
        int matrix[][]=new int[rows][columns];
        
        int transpose[][]=new int[rows][columns];
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
           for(int j=0;j<columns;j++)
            {
                transpose[j][i]=matrix[i][j];
            } 
        }
         System.out.println("the transpose is: ");

         for(int i=0;i<rows;i++)
        {
           for(int j=0;j<columns;j++)
            {
                
                System.out.println(transpose[i][j]);
            }
        }
    }

}
