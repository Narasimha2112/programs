import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) 
    {
        int n, c, fact = 1;

        System.out.println("Enter an integer to find its faactorial.");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        if(n < 0)
        {
            System.out.println("Number should be positive");
        }
        else
        {
            for(c = 1; c <= n; c++)

            fact = fact*c;

            System.out.println("The factorial of "+ n +" is = " +fact);
        }
    }
}