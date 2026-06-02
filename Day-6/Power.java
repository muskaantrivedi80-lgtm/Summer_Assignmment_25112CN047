import java.util.Scanner;

public class Power {
     public static void main(String args[]) {
        int n;
        int x;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        System.out.println("enter the no ");
        x=in.nextInt();
        System.out.println("enter the power");
        int k=1;
        

        for(int i=1;i<=x;i++)
        {
            k=k*n;
            
        }
        System.out.println("the power of" +n+ "," +x+ "is "+k);
    }
        
}
