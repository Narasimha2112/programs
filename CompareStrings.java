
import java.util.Scanner;

public class CompareStrings 
{
    public static void main(String[] args) {
        
        String s1, s2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string\n");
        s1 = sc.nextLine();

        System.out.println("Enter the Second string\n");
        s2 = sc.nextLine();

        if(s1.compareTo(s2)>0)
        {
            System.out.println("First string is greater than second string");
        }
        else if (s1.compareTo(s2)<0)
        {
            System.out.println("First string is smaller than second string");
        }
        else
        {
            System.out.println("Both strings are equal");
        }
    }
}
