import java.util.Scanner;

public class StringRotation {
      public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name1;
        String name2;
        System.out.println("Enter a word");
        name1=in.nextLine();
        System.out.println("enter other word");
        name2=in.nextLine();
        StringBuilder sb=new StringBuilder(name1);
    
        char s=sb.charAt(0);
        sb.append(s);
        sb.delete(0,1);
        if(sb.toString().equals(name2))
        {
            System.out.println("string rotate");

        }
        else
        {
            System.out.println("does not rotate");

        }
    }
        
}
