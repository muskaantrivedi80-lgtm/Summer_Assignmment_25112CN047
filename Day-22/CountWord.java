import java.util.Scanner;

public class CountWord {
      public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        int c=0;

        System.out.println("Enter string name");
        name=in.nextLine();
        while(true)
        {
        try
        {
            name.charAt(c);
            c=c+1;
         }
        
            catch(StringIndexOutOfBoundsException error)
            {
                break;

            }
        }
            System.out.println(c);
           
         }
        
        }

