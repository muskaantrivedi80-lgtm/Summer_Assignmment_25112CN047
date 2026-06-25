import java.util.Scanner;
public class MaxOccur {
     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        System.out.println("Enter name");
        name=in.nextLine();
        int k=0;
        char max=' ';
        StringBuilder sb=new StringBuilder(name);
        
        for(int i=0;i<sb.length();i++)
        {  
            int c=0;
            for(int j=0;j<sb.length();j++)
            {
                char a=sb.charAt(i);
                 char b=sb.charAt(j);
                if(a==b)
                {
                    c++;
                }
            }
                if(c>k)
                {
                    k=c;
                    max=sb.charAt(i);

                }
            }
            
            System.out.println(max);
           
}
}
