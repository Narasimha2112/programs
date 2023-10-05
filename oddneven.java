import java.util.Scanner;

public class oddneven 
{
    public static void main(String[] args) 
    {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Integer = ");
        x = sc.nextInt();

        if(x % 2 ==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
