package DecisionMaking;

import java.util.Scanner;

public class Continue
{
    public static void main(String[] args)
{
    Scanner ip=new Scanner(System.in);
    int n=ip.nextInt();
    for(int i=0;i<n;i++)
    {
        if(i%2!=0)
        {
            continue;
        }
        System.out.println("hi");
    }
}
}
