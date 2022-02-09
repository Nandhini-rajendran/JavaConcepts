package DecisionMaking;

import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        switch(n)
        {
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(2);
                break;
            case 2:
                System.out.println(3);
                break;
            default:
                System.out.println("false");


        }
    }
}
