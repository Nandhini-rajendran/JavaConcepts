import java.util.Scanner;
//onr dimensional array
public class Array
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=ip.next();
            System.out.print(str[i]+" ");
        }
        System.out.println("hello world");
        System.out.println("hi");
    }
}
