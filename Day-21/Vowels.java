import java.util.Scanner;

public class Vowels {
     public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        int v=0;
        int c=0;
        System.out.println("Enter string name");
        name=in.nextLine();
        StringBuilder sb=new StringBuilder(name);
        for(int i=0;i<sb.length();i++)
        {
          char w=sb.charAt(i);
          if(w=='a'||w=='e'||w=='i'||w=='o'||w=='u')
          {
            v++;
          }
          else
          {
            c++;
          }

        }
        System.out.println("vowels="+v+", consonents="+c);
}
}
