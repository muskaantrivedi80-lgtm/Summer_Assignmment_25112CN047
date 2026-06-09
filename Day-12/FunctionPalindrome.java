import java.util.Scanner;

public class FunctionPalindrome {
     public static void Pal(int a)
    {
       int rem=0;
       int k=0;
       int num=a;
       while(num>0)
       {
        rem=num%10;
        k=k*10+rem;
        num=num/10;
       }
       if(k==a)
       {
       System.out.println("palindrome");
       }
       else
       {
        System.out.println("not palindrome");
       }
        return ;
    } 
    public static void main(String args[])
    {
        int n;
        
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
       Pal(n);
    }
    
}


