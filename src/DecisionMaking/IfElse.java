package DecisionMaking;

import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=10;
        int i=ip.nextInt();
        if(i==n)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
