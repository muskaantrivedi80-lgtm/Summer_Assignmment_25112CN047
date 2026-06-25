import java.util.Scanner;

public class NonRepeating {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        System.out.println("Enter name");
        name=in.nextLine();
        String p=name;
       
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
                c=c+1;

              } 
              else
              {
                continue;
              }
            }    
        
        if(c==1)
        {
            System.out.println(sb.charAt(i));
            break;

        }
       
        
        }
    }
}
