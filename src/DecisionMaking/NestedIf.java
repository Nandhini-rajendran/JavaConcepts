package DecisionMaking;

import java.util.Scanner;

public class NestedIf
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        if(n==10)
        {
            if(n<10)
            {
                System.out.println("smaller");
            }
            if(n>10)
            {
                System.out.println("greater");

            }
            else
            {
                System.out.println("equal");
            }
        }
    }
}
