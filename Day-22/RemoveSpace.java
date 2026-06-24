import java.util.Scanner;

public class RemoveSpace {
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
            char c=sb.charAt(i);
            if((int)c==32)
            {
               sb.delete(i,i+1);
            }
            

        }
        System.out.println(sb);
}
}
