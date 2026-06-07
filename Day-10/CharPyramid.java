import java.util.Scanner; 
public class CharPyramid {
    public static void main(String args[])
    {
        for(char i=65;i<=69;i++)
        {
            for(int j=1;j<=69-i;j++)
            {
                System.out.print(" ");
            }
            for(char k=65;k<=i;k++)
            {
                System.out.print(k);
            }
            for(char m= (char)(i-1);m>=65;m--)
            {
                System.out.print(m);
            }
            System.out.println();
}
    }
}



