package DecisionMaking;

import java.util.Scanner;

public class IfElseIfLadder
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        if(n==10)
        {
            System.out.println("equal");
        }
        else if(n<10)
        {
            System.out.println("lesser");
        }
        else
        {
            System.out.println("greater");
        }
    }
}
