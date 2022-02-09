package Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringClass
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        String str=ip.nextLine();
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(3));
        System.out.println(str.substring(2,7));
        String str2="geeks";
        String str3="GEEKS FOR GEEKS";
        System.out.println(str2.concat(str3));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str2.trim());//removes the whitespaces at both end.
        System.out.println(str2.replace('e','a'));

    }
}
