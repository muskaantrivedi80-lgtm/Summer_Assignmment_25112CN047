import java.util.Scanner;
public class SortName {
       public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        int i;
        System.out.println("Enter name");
        name=in.nextLine();
        StringBuilder sb=new StringBuilder(name);
        
        for(i=0;i<sb.length();i++)
        {
            for(int j=i+1;j<sb.length();j++)
            {
                if((int)sb.charAt(i)>(int)sb.charAt(j))
                { 
                   char temp=sb.charAt(i);  
                   sb.setCharAt(i,sb.charAt(j));
                   sb.setCharAt(j,temp);
                     
                }
            }

        }
        System.out.println(sb);
    }

}
