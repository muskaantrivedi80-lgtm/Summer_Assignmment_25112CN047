
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
      
        System.out.println("Enter name");
        name=in.nextLine();
        String p=name;
        StringBuilder sb=new StringBuilder(name);
        for(int i=0;i<sb.length()/2;i++)
        {
            char f=sb.charAt(i);
            char l=sb.charAt(sb.length()-1-i);

            sb.setCharAt(i,l);
            sb.setCharAt(sb.length()-1-i,f);


        }
         int k= sb.toString().compareTo(p);
         if(k==0)
         {
            System.out.println("palindrome");

         }
         else
         {
            System.out.println("not palindrome");
         }
        }
          

    
}
