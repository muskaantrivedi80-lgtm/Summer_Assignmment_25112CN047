import java.util.Scanner;

public class CharFreq {
     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        String c;
        int count=0;
        System.out.println("Enter name");
        name=in.nextLine();
        System.out.println("enter a character");
        c=in.next();
        StringBuilder sb=new StringBuilder(name);
        for(int i=0;i<sb.length();i++)
        {
            char a=sb.charAt(i);
           if(a==c.charAt(0))
           {
            count++;

           }
         }
         System.out.println(count);
        }
}

