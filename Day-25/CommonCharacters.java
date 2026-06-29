import java.util.Scanner;
public class CommonCharacters {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name1,name2;
        int i;
        System.out.println("Enter first string");
        name1=in.nextLine();
        System.out.println("Enter second string");
        name2=in.nextLine();
        StringBuilder sb1=new StringBuilder(name1);
        StringBuilder sb2=new StringBuilder(name2);
        
        for(i=0;i<sb1.length();i++)
        {
            for(int j=0;j<sb2.length();j++)
                if(sb1.charAt(i)==sb2.charAt(j))
                {
                 System.out.print(sb1.charAt(i));
                   sb2.delete(j,j+1);
                }
                

            }
            
        }
    }



