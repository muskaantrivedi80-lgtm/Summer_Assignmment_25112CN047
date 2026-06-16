import java.util.Scanner;

public class MaxFrequency {
     public static void main(String[] args)
    {
        int array[]=new int[50];
        Scanner in=new Scanner(System.in);
        int k;
        int temp=0;
        int freq=0;
        int s=0;
        System.out.println("Enter no of elements");
        k=in.nextInt();
        int a=0;
        for(int i=0;i<k;i++)
        {
            array[i]=in.nextInt();
        } 
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(array[i]==array[j])
                { 
                    freq=freq+1;
                }
                if(freq>temp)
                {
                    temp=freq;
                    s=array[i];

                }
            }
        }
        System.out.println(s);
}
}
