import java.util.Scanner;
public class LongestWord {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a sentence");
        String line=in.nextLine();
        String word=" ";
        String l=" ";
        int k=0;
        int j;
        StringBuilder sb=new StringBuilder(line);
        for(int i=0;i<sb.length();)
        {
            int c=0;
            for( j=i+1;j<sb.length();j++)
            {
                if(sb.charAt(j)==' ')
                {
                    word=sb.substring(i,j);
                    i=j+1;
                    break;
                    
                }
                else
                {
                    c=c+1;

                }
        }
        if(j==sb.length())
        {
            word=sb.substring(i,j);
            i=j;
        }
        if(c>k)
        {
            k=c;
           l=word;
        }
       
    }

    System.out.println(l);
}
}