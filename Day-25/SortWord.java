import java.util.Scanner;
public class SortWord {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String names[]=new String[50];
        int k;
        System.out.println("enter no of names");
        k=in.nextInt();
        in.nextLine();
        System.out.println("enter names:");
        for(int i=0;i<k;i++)
        {
            names[i]=in.nextLine();

        }
            StringBuilder sb[]=new StringBuilder[k];
            for(int i=0;i<k;i++)
        {
            sb[i]=new StringBuilder(names[i]);
        }
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(sb[i].length()>sb[j].length())
                {
                    String temp=sb[i].toString();
                    sb[i]=sb[j];
                    sb[j]=new StringBuilder(temp);
                }
              
               

            }
           
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(sb[i]);
        }
    }

    
}
