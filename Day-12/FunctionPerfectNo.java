import java.util.Scanner;

public class FunctionPerfectNo {
    public static void Perfect(int a)
    {
        int k=0;
       for(int i=1;i<a;i++)
       {
        if(a%i==0)
        {
            k=k+i;
        }
    }
        if(k==a)
        {
            System.out.println("perfect no");
        }
        else
        {
            System.out.println("not perfect");
        }

       
        return ;
    } 
    public static void main(String args[])
    {
        int n;
        
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
       Perfect(n);
    }
    
}



