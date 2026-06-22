import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String name;
        System.out.println("Enter string name");
        name=in.nextLine();
        StringBuilder sb=new StringBuilder(name);
        for(int i=0;i<name.length()/2;i++)
        {
            char front=sb.charAt(i);
            char back=sb.charAt(name.length()-1-i);

            sb.setCharAt(i,back);
            sb.setCharAt(name.length()-1-i,front);

        }
        System.out.println(sb);
}
}
