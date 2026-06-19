import java.util.Scanner;

public class SubtractMatrix {
     public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows=in.nextInt();
        System.out.println("Enter no of columns:");
        int columns=in.nextInt();
        int matrix1[][]=new int[rows][columns];
        int matrix2[][]=new int[rows][columns];
        int diff[][]=new int[rows][columns];
        System.out.println("enter first matrix elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               matrix1[i][j]=in.nextInt();
            }
        }
        System.out.println("enter second array elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
               matrix2[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
           for(int j=0;j<columns;j++)
            {
                diff[i][j]=matrix1[i][j]-matrix2[i][j];
            } 
        }
          System.out.println("the difference is:");
         for(int i=0;i<rows;i++)
        {
           for(int j=0;j<columns;j++)
            {
                
                System.out.println(diff[i][j]);
            }
        }
    }
}




