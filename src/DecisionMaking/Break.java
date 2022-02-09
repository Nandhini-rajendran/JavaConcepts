package DecisionMaking;

import java.util.Scanner;

public class Break
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println("hi");
        }
        System.out.println("loop done");

    }
}
