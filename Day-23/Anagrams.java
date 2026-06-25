import java.util.*;
public class Anagrams {
      public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name1;
        String name2;
        int c=0;
        System.out.println("Enter name");
        name1=in.nextLine();
        System.out.println("Enter name");
        name2=in.nextLine();
        name1=name1.replace(" ","");
        name2=name2.replace(" ","");
      
        StringBuilder sb1=new StringBuilder(name1);
        StringBuilder sb2=new StringBuilder(name2);
        
        for(int i=0;i<sb1.length();i++)
        {
           
           for(int j=0;j<sb2.length();j++)
            {
                char a=sb1.charAt(i);
                char b=sb2.charAt(j);
               
                if(a==b)
                {
                    c++;
                    sb2.deleteCharAt(j);
                    break;

                }
                
            }
        }
              
        if(c==sb1.length())
        {
            System.out.println("anagrams");
        }
        else
        {
            System.out.println("not anagram");
        }
    
    
}
}
