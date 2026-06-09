import java.util.Scanner;

public class FunctionArmstrong {
    public static void Armstrong(int a)
    {
      int rem=0;
       double k=0;
       int num=a;
       int s=0;
       s=(int)Math.log10(a)+1;
       while(num>0)
       {
        rem=num%10;
        k=Math.pow(rem,s)+k;
        num=num/10;
       }
       if(k==a)
       {
        System.out.println("armstrong");
       }
       else
       {
       
        System.out.println("not armstrong");
       }
       
        return;
    } 
    public static void main(String args[])
    {
        int n;
        
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
       Armstrong(n);
    }
    
}
