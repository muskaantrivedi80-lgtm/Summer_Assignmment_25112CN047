import java.util.Scanner;
public class RemoveDuplicate {
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
               
                if(sb.charAt(i)==sb.charAt(j))
                {
                    sb.delete(j,j+1);
                }
            }
        }
        System.out.println(sb);
}
}