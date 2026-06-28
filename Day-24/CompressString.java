import java.util.Scanner;
public class CompressString {
      public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        int i;
        System.out.println("Enter name");
        name=in.nextLine();
        StringBuilder sb=new StringBuilder(name);
        
        for(i=0;i<sb.length();)
        {
            int c=1;
            int j;
            for( j=i+1;j<sb.length();j++)
            {
               
                if(sb.charAt(i)==sb.charAt(j))
                {
                   
                    c=c+1;
                }
                else
                {
                    break;
                }
               
            }
        
                System.out.print(sb.charAt(i));
                 if(c>1)
                {   
                    System.out.print(c);
                    
                }
                i=j;
            }
    }
}
