import java.util.Scanner;

public class Average {
    public static void main(String args[])
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int sum=0;
        double avg=0;
        System.out.println("Enter no of elements");
        k=in.nextInt();
        for(int i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            sum=sum+array[i];
            avg=sum/k;
        }
        
            System.out.println("the sum is:" +sum+ "the average is:" +avg);
        }
    }

